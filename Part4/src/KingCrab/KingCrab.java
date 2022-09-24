package KingCrab;

import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;
import CritterBase.CrabCritter;

import java.util.ArrayList;
import java.util.Locale;

public class KingCrab extends CrabCritter {
    private boolean moveaway(Actor actor){
        Grid grid = getGrid();
        ArrayList<Location> actorMovablelocations = grid.getEmptyAdjacentLocations(actor.getLocation());
        for(Location movable:actorMovablelocations){
            int thisx = getLocation().getRow();
            int thisy = getLocation().getCol();
            int actorx = movable.getRow();
            int actory = movable.getCol();
            double distance = Math.sqrt(Math.pow((thisx-actorx),2)+Math.pow((thisy-actory),2));
            int real_distance = (int) Math.floor(distance);
            if(real_distance>1){
                actor.moveTo(movable);
                return true;
            }
        }
        return false;
    }
    @Override
    /**
     * a KingCrab.KingCrab will try to move another actor one location away first.
     * If failed, it will remove the actor.
     * */
    public void processActors(ArrayList<Actor> actors) {
        for (Actor actor : actors)
        {
            if (!(actor instanceof Rock) && !(actor instanceof Critter) && !moveaway(actor))
                actor.removeSelfFromGrid();
        }
    }
}
