package myMaze.src.Maze;

import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Critter;
import info.gridworld.actor.Flower;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Location;
import org.junit.Test;

public class MazeBugTest {
    @Test
    public void testMazeBug(){
        MazeBug mazebug = new MazeBug();
        ActorWorld world = new ActorWorld();
        world.add(new Location(5,5),mazebug);
        world.add(new Location(5,6),new Rock());
        world.add(new Location(4,5),new Rock());
        world.add(new Location(3,5),new Rock());
        world.show();
        while(true);
    }
}
