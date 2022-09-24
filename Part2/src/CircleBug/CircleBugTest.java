package CircleBug;

import CircleBug.CircleBug;
import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;
import org.junit.Test;

import java.awt.*;


public class CircleBugTest {

    @Test
    public void act()
    {
        ActorWorld world = new ActorWorld();
        CircleBug alice = new CircleBug(6);
        alice.setColor(Color.BLUE);
        world.add(new Location(2, 5), alice);
        world.show();
        while(true);
    }
}