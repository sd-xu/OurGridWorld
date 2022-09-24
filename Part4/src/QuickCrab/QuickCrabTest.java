package QuickCrab;

import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import org.junit.Assert;
import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.assertEquals;

public class QuickCrabTest {
    @Test
    /**
     *test if QuickCrab.QuickCrab will move to its right or left two steps away if possible.
     * */
    public void testQuickCrab(){
        QuickCrab quickcrab = new QuickCrab();
        quickcrab.setColor(Color.blue);
        quickcrab.setDirection(0);
        ActorWorld world = new ActorWorld();
        Location old_location = quickcrab.getLocation();
        world.add(new Location(2,3),quickcrab);
        world.add(new Location(2,5),new Flower());
        world.step();
        Assert.assertEquals(new Location(2,1), quickcrab.getLocation());
        world.show();
        while (true);
    }
}
