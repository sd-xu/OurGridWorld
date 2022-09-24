package DancingBug;//package myDancingBug;//package myDancingBug;//package myDancingBug;

import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;
import DancingBug.DancingBug;
import org.junit.Test;

import java.awt.*;

public class DancingBugTest
{
    @Test
    public void act()
    {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8};
        ActorWorld world = new ActorWorld();
        DancingBug test = new DancingBug(a);
        test.setColor(Color.CYAN);
        world.add(new Location(5,5), test);
        world.show();
        while (true);
    }

}
