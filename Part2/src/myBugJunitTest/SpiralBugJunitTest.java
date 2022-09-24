import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;
import org.junit.Test;

import java.awt.*;

public class SpiralBugJunitTest {

    @Test
    public void act()
    {
        ActorWorld world = new ActorWorld();
        mySpiralBug.SpiralBug test = new mySpiralBug.SpiralBug(2);
        //设置颜色
        test.setColor(Color.GREEN);
        //将bug加入
        world.add(new Location(5,5), test);
        world.show();
        while (true);
    }
}