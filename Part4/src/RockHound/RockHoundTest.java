package RockHound;

import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Location;
import org.junit.Test;

import java.awt.*;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class RockHoundTest {
    @Test
    /**
     * test if RockHound.RockHound will eat all the eatable rock.
     * */
    public void testRockHound(){
        ActorWorld world = new ActorWorld();
        RockHound rockhound = new RockHound();
        rockhound.setColor(Color.ORANGE);
        world.add(new Location(0,0),rockhound);
        ArrayList<Rock> rocks = new ArrayList<>();
        for(int i = 0;i<3;i++)
            rocks.add(new Rock());
        int count = 0;
        for(int i = 0;i<2;i++)
            for(int j =0;j<2;j++){
                if(i==0 && j==0) continue;
                world.add(new Location(i,j),rocks.get(count++));
            }
        world.step();
        assertEquals(null,rocks.get(0).getLocation());
        assertEquals(null,rocks.get(1).getLocation());
        assertEquals(null,rocks.get(2).getLocation());
        world.show();
        while (true);
    }
}
