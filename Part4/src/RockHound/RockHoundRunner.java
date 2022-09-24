package RockHound;

import KingCrab.KingCrab;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Flower;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Location;
import CritterBase.CrabCritter;
import java.awt.*;

public class RockHoundRunner {
    public static void main(String[] argv){
        ActorWorld world = new ActorWorld();
        RockHound rockHound = new RockHound();
        CrabCritter crabcritter = new CrabCritter();
        KingCrab kingcrab = new KingCrab();
        kingcrab.setColor(Color.magenta);
        world.add(new Flower());
        world.add(new Rock());
        world.add(new Location(6,4),crabcritter);
        world.add(new Location(3,7),kingcrab);
        world.add(new Flower());
        world.add(new Rock());
        world.show();
    }
}
