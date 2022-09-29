package SparseBoundedGrid;

import SparseBoundedGrid3.SparseBoundedGrid3;
import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Location;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class SparseBoundedGridTest {

    @Test
    public void sparseBoundedGridTest() {
        ActorWorld world = new ActorWorld();
        world.setGrid(new SparseBoundedGrid<Actor>(10, 10));

        world.add(new Location(2, 2), new Critter());
        Assert.assertEquals(world.getGrid().isValid(new Location(2, 2)), true);
        Assert.assertEquals(world.getGrid().getOccupiedLocations().contains(new Location(2, 2)), true);

        world.getGrid().put(new Location(1, 1), new Critter());
        Assert.assertEquals(world.getGrid().getOccupiedLocations().contains(new Location(2, 2)), true);

        world.getGrid().remove(new Location(1, 1));
        Assert.assertEquals(world.getGrid().get(new Location(1, 1)), null);
    }
}