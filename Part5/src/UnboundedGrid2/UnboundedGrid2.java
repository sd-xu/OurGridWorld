package UnboundedGrid2;

import info.gridworld.grid.Grid;
import info.gridworld.grid.AbstractGrid;
import info.gridworld.grid.Location;
import java.util.ArrayList;
import java.util.*;

public class UnboundedGrid2<E> extends AbstractGrid<E> {
    private Object[][] occupantArray;
    private int dim; // 大小(dimension)

    public UnboundedGrid2() {
        dim = 16;
        occupantArray = new Object[dim][dim];;
    }

    @Override
    public int getNumRows() { return -1; }

    @Override
    public int getNumCols() { return -1; }

    @Override
    public boolean isValid(Location loc) {
        return loc.getRow() >= 0 && loc.getCol() >= 0;
    }

    @Override
    public ArrayList<Location> getOccupiedLocations() {
        ArrayList<Location> theLocations = new ArrayList<Location>();
        for (int r = 0; r < dim; r++)
            for (int c = 0; c < dim; c++) {
                Location loc = new Location(r, c);
                if (get(loc) != null)
                    theLocations.add(loc);
            }

        return theLocations;
    }

    @Override
    public E get(Location loc) {
        if (!isValid(loc))
            throw new IllegalArgumentException("Location " + loc + " is not valid");

        if(loc.getRow() >= dim || loc.getCol() >= dim)
            return null; // 不在array里

        return (E) occupantArray[loc.getRow()][loc.getCol()];
    }

    @Override
    public E put(Location loc, E obj) {
        if (loc == null)
            throw new NullPointerException("loc == null");
        if (obj == null)
            throw new NullPointerException("obj == null");

        if (loc.getRow() >= dim || loc.getCol() >= dim)
            resize(loc); // 新位置出界了,resize

        E oldOccupant = get(loc);
        occupantArray[loc.getRow()][loc.getCol()] = obj;
        return oldOccupant;
    }

    @Override
    public E remove(Location loc) {
        if (!isValid(loc))
            throw new IllegalArgumentException("Location " + loc + " is not valid");
        if(loc.getRow() >= dim || loc.getCol() >= dim)
            return null; // 不在array里

        E r = get(loc);
        occupantArray[loc.getRow()][loc.getCol()] = null;
        return r;
    }

    private void resize(Location loc) {
        int size = dim;
        while (loc.getRow() >= size || loc.getCol() >= size)
            size *= 2; // 乘2直到满足条件

        // 创建新的array
        Object[][] temp = new Object[size][size];

        // 复制所有旧的
        for(int r = 0; r < dim; r++)
            for(int c = 0; c < dim; c++)
                temp[r][c] = occupantArray[r][c];

        // 取代
        occupantArray = temp;
        dim = size;
    }
}