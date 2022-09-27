package SparseBoundedGrid;

import info.gridworld.grid.Grid;
import info.gridworld.grid.AbstractGrid;
import info.gridworld.grid.Location;
import java.util.ArrayList;

public class SparseBoundedGrid<E> extends AbstractGrid<E> {
    private SparseGridNode[] occupantArray;
    private int numRows;
    private int numCols;

    public SparseBoundedGrid(int numRows, int numCols) {
        if (numRows <= 0)
            throw new IllegalArgumentException("numRows <= 0");
        if (numCols <= 0)
            throw new IllegalArgumentException("numCols <= 0");
        this.numRows = numRows;
        this.numCols = numCols;
        occupantArray = new SparseGridNode[numRows];
    }

    @Override
    public int getNumRows() { return numRows; }

    @Override
    public int getNumCols() { return numCols; }

    @Override
    public boolean isValid(Location loc) {
        return loc.getRow() >= 0
                && loc.getRow() < getNumRows()
                && loc.getCol() >= 0
                && loc.getCol() < getNumCols();
    }

    @Override
    public ArrayList<Location> getOccupiedLocations() {
        ArrayList<Location> theLocations = new ArrayList<Location>();
        for (int r = 0; r < getNumRows(); r++) {
            SparseGridNode p = occupantArray[r]; // 取行的 linked list
            while(p != null) { // 遍历
                Location loc = new Location(r, p.getCol());
                theLocations.add(loc);
                p = p.getNext();
            }
        }
        return theLocations;
    }

    @Override
    public E get(Location loc) {
        if (!isValid(loc))
            throw new IllegalArgumentException("Location " + loc + " is not valid");

        SparseGridNode p = occupantArray[loc.getRow()];
        while(p != null) {
            if(loc.getCol() == p.getCol())
                return (E) p.getOccupant(); // 强制转换
            p = p.getNext();
        }

        return null;
    }

    @Override
    public E put(Location loc, E obj) {
        if (!isValid(loc))
            throw new IllegalArgumentException("Location " + loc + " is not valid");
        if (obj == null)
            throw new NullPointerException("obj == null");

        E oldOccupant = remove(loc); // 移除旧的

        SparseGridNode p = occupantArray[loc.getRow()]; // 取行
        occupantArray[loc.getRow()] = new SparseGridNode(obj, loc.getCol(), p); // 把新的放在列表头

        return oldOccupant;
    }

    @Override
    public E remove(Location loc) {
        if (!isValid(loc))
            throw new IllegalArgumentException("Location " + loc + " is not valid");

        E obj = get(loc);
        if (obj == null)    return null;
        SparseGridNode p = occupantArray[loc.getRow()]; // 取行

        if(p != null) {
            if(p.getCol() == loc.getCol()) // 检查第一个
                occupantArray[loc.getRow()] = p.getNext();
            else { // q为移除目标, p为其前一个
                SparseGridNode q = p.getNext();
                while(q!= null && q.getCol() != loc.getCol()) {
                    p = p.getNext();
                    q = q.getNext();
                }
                if(q != null) // 找到了
                    p.setNext(q.getNext());
            }
        }
        return obj;
    }
}
