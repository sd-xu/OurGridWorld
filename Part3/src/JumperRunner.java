import info.gridworld.actor.*;

public class JumperRunner {
    
    public static void main(String[] argv){

        ActorWorld world = new ActorWorld();

        world.add(new Jumper());
        world.add(new Bug());
        world.add(new Rock());
        world.add(new Flower());
        world.show();

    }

}
