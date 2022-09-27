package SparseBoundedGrid2;

import info.gridworld.grid.Grid;
import info.gridworld.grid.AbstractGrid;
import info.gridworld.grid.Location;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Iterator;

public class SparseBoundedGrid2 <E> extends AbstractGrid<E> {
    private ArrayList<LinkedList> occupantArray;
    private int numRows;
    // the grid elements
    private int numCols;

    public SparseBoundedGrid2(int numRows, int numCols) {
        if (numRows <= 0)
            throw new IllegalArgumentException("numRows <= 0");
        if (numCols <= 0)
            throw new IllegalArgumentException("numCols <= 0");
        this.numRows = numRows;
        this.numCols = numCols;
        occupantArray = new ArrayList<LinkedList>();
        for(int i = 0; i < numRows; i++)
            occupantArray.add(new LinkedList<OccupantInCol>());
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
            LinkedList<OccupantInCol> row = occupantArray.get(r); // 取行的 linked list
            if(row != null)
                for(OccupantInCol occ: row) {
                    Location loc = new Location(r, occ.getColNum());
                    theLocations.add(loc);
                }
        }
        return theLocations;
    }

    @Override
    public E get(Location loc) {
        if (!isValid(loc))
            throw new IllegalArgumentException("Location " + loc + " is not valid");

        LinkedList<OccupantInCol> row = occupantArray.get(loc.getRow());
        if(row != null)
            for(OccupantInCol occ: row)
                if(loc.getCol() == occ.getColNum())
                    return (E)occ.getOccupant(); // 强制转换

        return null;
    }

    @Override
    public E put(Location loc, E obj) {
        if (!isValid(loc))
            throw new IllegalArgumentException("Location " + loc + " is not valid");
        if (obj == null)
            throw new NullPointerException("obj == null");

        E oldOccupant = remove(loc); // 移除旧的
        occupantArray.get(loc.getRow()).add(new OccupantInCol(obj,loc.getCol()));

        return oldOccupant;
    }

    @Override
    public E remove(Location loc) {
        if (!isValid(loc))
            throw new IllegalArgumentException("Location " + loc + " is not valid");

        E obj = get(loc);
        if (obj == null)    return null;
        LinkedList<OccupantInCol> row = occupantArray.get(loc.getRow());

        if(row != null) {
            Iterator<OccupantInCol> itr = row.iterator();
            while(itr.hasNext())
                if(itr.next().getColNum() == loc.getCol()) {
                    itr.remove();
                    break;
                }
        }

        return obj;
    }
}