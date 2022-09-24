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
        // 创建一个ZShape类型的测试
        ZShapeBug test = new ZShapeBug(4);
        //设置方向和颜色
        test.setDirection(90);
        test.setColor(Color.ORANGE);
        //把test样例加到world里面
        world.add(new Location(2,2), test);
        world.show();
        while (true);
    }
}
