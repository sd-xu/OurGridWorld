package SpiralBug;

import SpiralBug.SpiralBug;
import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;
import org.junit.Test;

import java.awt.*;

public class SpiralBugTest
{
    @Test
    public void act()
    {
        ActorWorld world = new ActorWorld();
        SpiralBug test = new SpiralBug(2);
        test.setColor(Color.GREEN);
        world.add(new Location(5,5), test);
        world.show();
        while (true);
    }
}
