package ChameleonKid;

import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Flower;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Location;
import KingCrab.KingCrab;

import java.awt.*;

public class ChameleonKidRunner {
    public static void main(String[] argv){
        ActorWorld world = new ActorWorld();
        ChameleonKid chameleonKid = new ChameleonKid();
        chameleonKid.setColor(Color.YELLOW);
        KingCrab kingcrab = new KingCrab();
        kingcrab.setColor(Color.magenta);
        world.add(new Flower());
        world.add(new Rock());
        world.add(new Location(3,4),chameleonKid);
        world.add(new Location(3,5),kingcrab);
        world.add(new Flower());
        world.add(new Rock());
        world.show();
    }
}
