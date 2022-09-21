import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Flower;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Location;

import java.awt.*;

public class CritterRunner {
    public static void main(String[] argv){
        ActorWorld world = new ActorWorld();
        CrabCritter crabcritter = new CrabCritter();
        crabcritter.setColor(Color.CYAN);
        world.add(new Location(5,5),crabcritter);
        world.add(new Rock());
        world.add(new Flower());
        world.show();
    }
}
