import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Critter;
import info.gridworld.actor.Flower;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;
import info.gridworld.world.World;
import org.testng.annotations.Test;

import java.awt.*;
import java.util.ArrayList;

import static org.testng.AssertJUnit.assertEquals;

public class CritterTest{
    public KingCrab kingcrab = new KingCrab();
    public BlusterCritter bluster = new BlusterCritter(1);
    public RockHound rockhound = new RockHound();
    public QuickCrab quickcrab = new QuickCrab();
    public ChameleonKid chameleonkid = new ChameleonKid();
    @Test
    /**
     * test if KingCrab will try to move first before it eats.
     * */
    public void testKingCrab(){
        kingcrab.setColor(Color.magenta);
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
        assertEquals(null,flowers.get(0).getLocation());
    }
    @Test
    /**
     *test if QuickCrab will move to its right or left two steps away if possible.
     * */
    public void testQuickCrab(){
        quickcrab.setColor(Color.blue);
        quickcrab.setDirection(0);
        ActorWorld world = new ActorWorld();
        Location old_location = quickcrab.getLocation();
        world.add(new Location(2,3),quickcrab);
        world.add(new Location(2,5),new Flower());
        world.step();
        assertEquals(new Location(2,1), quickcrab.getLocation());
    }
    @Test
    /**
     *test if BlusterCrab will get lighten or get darken when something occurs.
     * */
    public void testBluster(){
        double DARKENING_FACTOR = 0.02;
        bluster.setColor(Color.YELLOW);
        ActorWorld world = new ActorWorld();
        Color current_color = bluster.getColor();
        int red = (int) (current_color.getRed() * (1 - DARKENING_FACTOR));
        int green = (int) (current_color.getGreen() * (1 - DARKENING_FACTOR));
        int blue = (int) (current_color.getBlue() * (1 - DARKENING_FACTOR));
        Color after_color = new Color(red, green, blue);
        //the initialized coverage is one.
        world.add(new Location(5,5),bluster);
        world.add(new Location(5,6),new Critter());
        world.add(new Location(6,4),new Critter());
        world.step();
        assertEquals(after_color,bluster.getColor());
    }
    @Test
    /**
     *test if ChameleonKid will change its color under some circumstances.
     * todo
     * */
    public void testChameleonKid(){
        chameleonkid.setColor(Color.GREEN);
    }
    @Test
    /**
     * test if RockHound will eat all the eatable rock.
     * todo
     * */
    public void testRockHound(){
        rockhound.setColor(Color.ORANGE);
    }

}
