package ZShapeBug;

import ZShapeBug.ZShapeBug;
import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;
import org.junit.Test;

import java.awt.*;

public class ZShapeBugTest
{
    @Test
    public void act()
    {
        ActorWorld world = new ActorWorld();
        ZShapeBug test = new ZShapeBug(4);
        test.setDirection(90);
        test.setColor(Color.ORANGE);
        world.add(new Location(2,2), test);
        world.show();
        while (true);
    }
}
