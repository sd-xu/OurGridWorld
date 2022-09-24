import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

import java.awt.*;

public class CircleBugRunner
{
    public static void main(String[] args) {
        ActorWorld world = new ActorWorld();
        //创建bug
        CircleBug alice = new CircleBug(6);
        //设置bug颜色
        alice.setColor(Color.BLUE);
        //把bug加到里面
        //可以多加几个bug
        //CircleBug bob = new CircleBug(3);
//        world.add(new Location(5, 5), bob);
        world.add(new Location(2, 5), alice);
        //show the grids
        world.show();
    }

}