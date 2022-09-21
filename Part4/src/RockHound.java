import info.gridworld.actor.Actor;
import info.gridworld.actor.Rock;

import java.util.ArrayList;

public class RockHound extends ChameleonCritter {
    @Override
    /**
     * a RockHound moves like a Critter
     * but eats all the rocks in the neighbours list.
     * */
    public void processActors(ArrayList<Actor> actors) {
        for(Actor actor:actors){
            if(actor instanceof Rock){
                actor.removeSelfFromGrid();
            }
        }
    }
}
