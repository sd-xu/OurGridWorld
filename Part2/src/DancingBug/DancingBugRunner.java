package DancingBug;

import DancingBug.DancingBug;
import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

import java.awt.*;

public class DancingBugRunner
{
    public static void main(String[] args)
    {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8};
        ActorWorld world = new ActorWorld();
        DancingBug test = new DancingBug(a);
        test.setColor(Color.CYAN);
        world.add(new Location(5,5), test);
        world.show();
    }
}
