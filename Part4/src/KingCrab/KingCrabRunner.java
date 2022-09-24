package KingCrab;

import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Flower;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Location;
import CritterBase.CrabCritter;

import java.awt.*;

public class KingCrabRunner {
    public static void main(String[] argv){
        ActorWorld world = new ActorWorld();
        CrabCritter crabcritter = new CrabCritter();
        KingCrab kingcrab = new KingCrab();
        kingcrab.setColor(Color.YELLOW);
        world.add(new Location(7,4),crabcritter);
        world.add(new Location(3,5),kingcrab);
        world.add(new Flower());
        world.add(new Rock());
        world.add(new Flower());
        world.add(new Rock());
        world.add(new Flower());
        world.add(new Rock());
        world.show();
    }
}
