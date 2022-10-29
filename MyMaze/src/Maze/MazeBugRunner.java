package Maze;//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//



import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Location;

public class MazeBugRunner {
    public MazeBugRunner() {
    }

    public static void main(String[] var0) {
        ActorWorld var1 = new ActorWorld();
        var1.add(new Location(0, 0), new MazeBug());
        var1.add(new Location(1, 1), new Rock());
        var1.step();
        var1.show();
    }
}
