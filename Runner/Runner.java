package Run;

import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Rock;
import info.gridworld.actor.Critter;

public class Runner {
    public static void main(String[] argv){

        ActorWorld world = new ActorWorld();

        world.add(new Bug());
        world.add(new Rock());
        world.add(new Critter());
        
        world.show();

    }
}
