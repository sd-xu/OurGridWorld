package BlusterCritter;

import KingCrab.KingCrab;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Flower;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Location;
import CritterBase.CrabCritter;
public class BlusterCritterRunner {
    public static void main(String[] argv){
        ActorWorld world = new ActorWorld();
        CrabCritter crabcritter = new CrabCritter();
        KingCrab kingcrab = new KingCrab();
        BlusterCritter blusterCritter = new BlusterCritter(2);
//        blusterCritter.setColor(Color.blue);
//        kingcrab.setColor(Color.magenta);
        world.add(new Flower());
        world.add(new Rock());
        world.add(new Location(8,3),crabcritter);
        world.add(new Location(2,2),kingcrab);
        world.add(new Location(4,1),blusterCritter);
        world.add(new Flower());
        world.add(new Rock());
        world.show();
    }
}
