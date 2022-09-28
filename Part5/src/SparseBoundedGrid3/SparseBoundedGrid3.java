package SparseBoundedGrid3;

import info.gridworld.grid.AbstractGrid;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class SparseBoundedGrid3<E> extends AbstractGrid<E> {
    private Map<Location, E> occupantMap;
    private int numRows;
    private int numCols;

    public SparseBoundedGrid3(int rows, int cols) {
        occupantMap = new HashMap<Location, E>();
        numRows = rows;
        numCols = cols;
    }

    @Override
    // 要改的
    public int getNumRows() { return numRows; }

    @Override
    // 要改的
    public int getNumCols() { return numCols; }

    @Override
    // 要改的
    public boolean isValid(Location loc) {
        return loc.getRow() >= 0
                && loc.getRow() < getNumRows()
                && loc.getCol() >= 0
                && loc.getCol() < getNumCols();
    }

    @Override
    // 不用改的
    public ArrayList<Location> getOccupiedLocations() {
        ArrayList<Location> a = new ArrayList<Location>();
        for (Location loc : occupantMap.keySet())
            a.add(loc);
        return a;
    }

    @Override
    // 不用改的
    public E get(Location loc) {
        if (loc == null)
            throw new NullPointerException("loc == null");
        return occupantMap.get(loc);
    }

    @Override
    // 不用改的
    public E put(Location loc, E obj) {
        if (loc == null)
            throw new NullPointerException("loc == null");
        if (obj == null)
            throw new NullPointerException("obj == null");
        return occupantMap.put(loc, obj);
    }

    @Override
    // 不用改的
    public E remove(Location loc) {
        if (loc == null)
            throw new NullPointerException("loc == null");
        return occupantMap.remove(loc);
    }
}