import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Flower;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Location;
import org.testng.annotations.Test;

import java.awt.*;

public class CritterTest{
    public KingCrab kingcrab = new KingCrab();
    public BlusterCritter bluster = new BlusterCritter(5);
    public RockHound rockhound = new RockHound();
    public QuickCrab quickcrab = new QuickCrab();
    public ChameleonKid chameleonkid = new ChameleonKid();
    @Test
    /**
     * test if KingCrab will try to move first before it eats.
     * */
    public void testKingCrab(){
        kingcrab.setColor(Color.magenta);
        ActorWorld world = new ActorWorld();
        world.add(new Location(5,5),kingcrab);
        world.add(new Rock());
        world.add(new Flower());
        world.show();
    }
    @Test
    /**
     *test if QuickCrab will move to its right or left if possible.
     * */
    public void testQuickCrab(){
        quickcrab.setColor(Color.blue);
    }
    @Test
    /**
     *test if BlusterCrab will get lighten or get darken when something occurs.
     * */
    public void testBluster(){
        bluster.setColor(Color.YELLOW);
    }
    @Test
    /**
     *test if ChameleonKid will change its color under some circumstances.
     * */
    public void testChameleonKid(){
        chameleonkid.setColor(Color.GREEN);
    }
    @Test
    /**
     * test if RockHound will eat all the eatable rock.
     * */
    public void testRockHound(){
        rockhound.setColor(Color.ORANGE);
    }

}
