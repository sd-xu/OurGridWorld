package SparseBoundedGrid2;

import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Location;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SparseBoundedGrid2Test {

    @Test
    public void sparseBoundedGrid2Test() {
        ActorWorld world = new ActorWorld();
        world.setGrid(new SparseBoundedGrid2<Actor>(10, 10));

        world.add(new Location(2, 2), new Critter());
        Assert.assertEquals(world.getGrid().isValid(new Location(2, 2)), true);
        Assert.assertEquals(world.getGrid().getOccupiedLocations().contains(new Location(2, 2)), true);

        world.getGrid().put(new Location(1, 1), new Critter());
        Assert.assertEquals(world.getGrid().getOccupiedLocations().contains(new Location(2, 2)), true);

        world.getGrid().remove(new Location(1, 1));
        Assert.assertEquals(world.getGrid().get(new Location(1, 1)), null);
    }
}