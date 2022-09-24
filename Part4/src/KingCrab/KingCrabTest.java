package KingCrab;

import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import org.junit.Test;

import java.awt.*;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class KingCrabTest {
    @Test
    /**
     * test if KingCrab.KingCrab will try to move first before it eats.
     * */
    public void testKingCrab(){
        KingCrab kingcrab = new KingCrab();
        kingcrab.setColor(Color.magenta);
        kingcrab.setDirection(180);
        ArrayList<Flower> flowers = new ArrayList<Flower>();
        for(int i = 0;i<8;i++){
            flowers.add(new Flower());
        }
        ActorWorld world = new ActorWorld();
        world.add(new Location(0,0),kingcrab);
        int count = 0;
        for(int i = 0;i<3;i++){
            for(int j = 0;j<3;j++)
            {
                if(i==0 && j==0) continue;
                world.add(new Location(i,j),flowers.get(count++));
            }
        }
        world.step();
        assertEquals(null,flowers.get(3).getLocation());
        world.show();
        while (true);
    }
}
