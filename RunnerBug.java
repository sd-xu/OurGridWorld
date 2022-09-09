package GridWorld.GridCode;

import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Rock;
import GridWorld.GridCode.SelfBug.*;
import info.gridworld.actor.Critter;

public class RunnerBug {
    public static void main(String[] argv){

        ActorWorld world = new ActorWorld();

        Bug bug = new ZShapeBug(3);

        world.add(bug);
        world.add(new Rock());
        world.add(new Critter());

        if(bug.canMove()) bug.move();
        
        world.show();

    }
}
