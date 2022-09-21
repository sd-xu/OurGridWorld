import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;
import org.junit.Test;

import java.awt.*;

public class DancingBugJunitTest {

    @Test
    public void act()
    {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8};
        ActorWorld world = new ActorWorld();
        myDancingBug.DancingBug test = new myDancingBug.DancingBug(a);
        test.setColor(Color.CYAN);
        world.add(new Location(5,5), test);
        world.show();
    }
}