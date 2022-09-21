import info.gridworld.actor.*;

public class JumperRunner {
    
    public static void main(String[] argv){
        //创建world
        ActorWorld world = new ActorWorld();
        //创建world中的各种属性并加入
        world.add(new Jumper());
        world.add(new Bug());
        world.add(new Rock());
        world.add(new Flower());
        world.show();

    }

}
