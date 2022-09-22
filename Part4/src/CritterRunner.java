import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Flower;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Location;

import java.awt.*;
import java.util.ArrayList;

public class CritterRunner {
    public static void main(String[] argv){
        ActorWorld world = new ActorWorld();
        CrabCritter crabcritter = new CrabCritter();
        KingCrab kingcrab = new KingCrab();
        kingcrab.setColor(Color.magenta);
        world.add(new Location(3,4),crabcritter);
        world.add(new Location(3,5),kingcrab);
        world.add(new Flower());
        world.add(new Rock());
        world.show();
    }
}
