package ChameleonKid;

import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;
import org.junit.Test;
import CritterBase.CrabCritter;
import java.awt.*;

public class ChameleonKidTest {
    @Test
    /**
     *test if ChameleonKid.ChameleonKid will change its color under some circumstances.
     * */
    public void testChameleonKid(){
        ActorWorld world = new ActorWorld();
        ChameleonKid chameleonkid = new ChameleonKid();
        chameleonkid.setColor(Color.GREEN);
        chameleonkid.setDirection(0);
        CrabCritter aCritter = new CrabCritter();
        aCritter.setColor(Color.YELLOW);
        world.add(new Location(6,6),chameleonkid);
        world.add(new Location(5,6),aCritter);
        chameleonkid.processActors(chameleonkid.getActors());
        world.show();
        while (true);
    }
}
