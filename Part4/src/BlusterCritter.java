import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;

import java.awt.*;
import java.util.ArrayList;

public class BlusterCritter extends ChameleonCritter{

    private int coverage;
    private static final double DARKENING_FACTOR = 0.02;
    private static final double LIGHTENING_FACTOR = 0.4;
    public BlusterCritter(int c){
        super();
        this.coverage = c;
    }
    @Override
    /**
     * return neighbours in 24 grids instead of 8 grids.
     * */
    public ArrayList<Actor> getActors() {
        return super.getActors();
    }

    @Override
    public void processActors(ArrayList<Actor> actors) {
        int count = 0;
        for(Actor actor:actors){
            if(actor instanceof Critter)
                count++;
        }
        if(count<this.coverage){
            setLightColor();
        }else{
            setDarkColor();
        }
    }
    /**
     *reuse and modify some part of the code from class Flower.
     * */
    private void setDarkColor(){
        Color current_color = getColor();
        int red = (int) (current_color.getRed() * (1 - DARKENING_FACTOR));
        int green = (int) (current_color.getGreen() * (1 - DARKENING_FACTOR));
        int blue = (int) (current_color.getBlue() * (1 - DARKENING_FACTOR));
        setColor(new Color(red, green, blue));
    }
    /**
     * reuse the code above.
     * remains something to think about.
     * */
    private void setLightColor(){
        Color current_color = getColor();
        int red = (int) (current_color.getRed() * (1 + LIGHTENING_FACTOR));
        int green = (int) (current_color.getGreen() * (1 + LIGHTENING_FACTOR));
        int blue = (int) (current_color.getBlue() * (1 + LIGHTENING_FACTOR));
        setColor(new Color(red, green, blue));
    }
}
