import info.gridworld.actor.Actor;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

import java.util.ArrayList;
import java.util.List;

public class ChameleonKid extends ChameleonCritter{
    /**
     * rewrite the function getActors because a kid changes its color
     * when and only when there are actors in front of or behind of it.
     * */
    public ArrayList<Actor> getActors(){
        List<Actor> neighbours = new ArrayList<Actor>(); // to return
        int[] directions = {Location.AHEAD,Location.HALF_CIRCLE}; //limited directions
        for(Location l:getLocationsInDirections(directions)){
            Actor neighbour = getGrid().get(l);//to find qualified neighbours.
            if(neighbour!=null){
                neighbours.add(neighbour);//if exists, add it to the list.
            }
        }
        return (ArrayList<Actor>) neighbours;
    }
    public ArrayList<Location> getLocationsInDirections(int[] directions){
        ArrayList<Location> locations = new ArrayList<Location>();
        for(int direct:directions){
            Location neighbour_location = getLocation().getAdjacentLocation(getDirection()+direct); // get the qualified neighbour.
            if (getGrid().isValid(neighbour_location)){
                locations.add(neighbour_location);
            }
        }
        return locations;
    }
}
