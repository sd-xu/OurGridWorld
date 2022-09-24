package ChameleonKid;

import info.gridworld.actor.Actor;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import CritterBase.ChameleonCritter;

public class ChameleonKid extends ChameleonCritter {
    @Override
    /**
     * rewrite the function getActors because a kid changes its color
     * when and only when there are actors in front of or behind of it.
     * */
    public ArrayList<Actor> getActors(){
        ArrayList<Actor> neighbours = new ArrayList<Actor>(); // to return
        int[] directions = {Location.AHEAD,Location.HALF_CIRCLE}; //limited directions
        for(Location l:getLocationsInDirections(directions)){
            Actor neighbour = getGrid().get(l);//to find qualified neighbours.
            if(neighbour!=null){
                neighbours.add(neighbour);//if exists, add it to the list.
            }
        }
        return neighbours;
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

    @Override
    public void processActors(ArrayList<Actor> actors) {
        boolean flag = false;
        for(Actor actor:actors){
            if(actor!=null){
                Color actor_c = actor.getColor();
                this.setColor(actor_c);
                flag = true;
                break;
            }
        }
        if(flag==false){
            setDarkColor();
        }
    }
    private void setDarkColor(){
        Color current_color = getColor();
        int red = (int) (current_color.getRed() * (1 - ChameleonCritter.DARKENING_FACTOR));
        int green = (int) (current_color.getGreen() * (1 - ChameleonCritter.DARKENING_FACTOR));
        int blue = (int) (current_color.getBlue() * (1 - ChameleonCritter.DARKENING_FACTOR));
        setColor(new Color(red, green, blue));
    }
}
