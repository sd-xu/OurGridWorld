package Jumper;

import Jumper.Jumper;
import info.gridworld.actor.*;
import info.gridworld.grid.Location;

import java.awt.*;

public class JumperRunner {
    
    public static void main(String[] argv) {
        ActorWorld world = new ActorWorld();
        Jumper alice = new Jumper();
        alice.setColor(Color.ORANGE);
        world.add(new Location(5, 5), alice);
        world.add(new Rock());
        world.add(new Flower());
        world.add(new Bug());
        world.show();
    }

}
