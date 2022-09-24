package QuickCrab;

import CritterBase.CrabCritter;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Flower;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Location;

import java.awt.*;

public class QuickCrabRunner {
    public static void main(String[] argv){
        ActorWorld world = new ActorWorld();
        CrabCritter crabcritter = new CrabCritter();
        QuickCrab quickCrab = new QuickCrab();
        quickCrab.setColor(Color.GREEN);
        world.add(new Location(3,4),crabcritter);
        world.add(new Location(3,5),quickCrab);
        world.add(new Flower());
        world.add(new Rock());
        world.show();
    }
}
