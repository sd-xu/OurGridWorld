import info.gridworld.actor.*;

public class Main {
    public static void main(String[] args)
    {

        ActorWorld world = new ActorWorld();
        world.add(new CircleBug(2));
        world.show();

    }
}