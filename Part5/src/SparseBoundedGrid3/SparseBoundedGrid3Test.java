package SparseBoundedGrid3;

import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Location;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SparseBoundedGrid3Test {

    @Test
    public void sparseBoundedGrid3Test() {
        ActorWorld world = new ActorWorld();
        world.setGrid(new SparseBoundedGrid3<Actor>(10, 10));

        world.add(new Location(2, 2), new Critter());
        Assert.assertEquals(world.getGrid().isValid(new Location(2, 2)), true);
        Assert.assertEquals(world.getGrid().getOccupiedLocations().contains(new Location(2, 2)), true);

        world.getGrid().put(new Location(1, 1), new Critter());
        Assert.assertEquals(world.getGrid().getOccupiedLocations().contains(new Location(2, 2)), true);

        world.getGrid().remove(new Location(1, 1));
        Assert.assertEquals(world.getGrid().get(new Location(1, 1)), null);
    }
}