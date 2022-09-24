package QuickCrab;

import CritterBase.CrabCritter;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;
import CritterBase.CrabCritter;
import java.util.ArrayList;

public class QuickCrab extends CrabCritter {
    /**
     * a QuickCrab.QuickCrab moves two spaces to its right or left,
     * differing from the CritterBase.CrabCritter.
     * */
    @Override
    public ArrayList<Location> getMoveLocations() {
        ArrayList<Location> movelocations = new ArrayList<Location>();
        Grid grid = getGrid();
        getTwoSteps(movelocations,Location.LEFT);
        getTwoSteps(movelocations,Location.RIGHT);
        if(movelocations.isEmpty())
            return super.getMoveLocations();
        else return movelocations;
    }
    /**
     * check and add locations if locations are available.
     * */
    private void getTwoSteps(ArrayList<Location> locations,int direction){
        Grid grid = getGrid();//得到当前方位
        Location onesteplocation = getLocation().getAdjacentLocation(direction);
        if(grid.isValid(onesteplocation) && grid.get(onesteplocation) == null){
                Location twosteplocation = onesteplocation.getAdjacentLocation(direction);
                if(grid.isValid(twosteplocation) && grid.get(twosteplocation)==null)
                    locations.add(twosteplocation);
        }
    }

}
