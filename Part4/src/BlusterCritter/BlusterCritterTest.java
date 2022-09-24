package BlusterCritter;

import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Location;
import org.junit.Assert;
import org.junit.Test;
import java.awt.*;
import static org.junit.Assert.assertEquals;

public class BlusterCritterTest {
    @Test
    /**
     *test if BlusterCrab will get lighten or get darken when something occurs.
     * */
    public void testBluster(){
        BlusterCritter bluster = new BlusterCritter(1);
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
        Assert.assertEquals(after_color,bluster.getColor());
        world.show();
        while (true);
    }
}
