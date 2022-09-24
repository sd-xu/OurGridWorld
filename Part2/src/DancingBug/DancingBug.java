package DancingBug;//package GridWorld.GridCode.SelfBug;

import info.gridworld.actor.Bug;

public class DancingBug extends Bug{
    
    private int[] dires;
    private int direIndex;

    public DancingBug(int[] dires){
        this.dires = dires.clone();
        this.direIndex = 0;
    }

    @Override
    public void act(){

        direIndex %= dires.length;

        setDirection(this.getDirection() + dires[direIndex] * 45);

        ++direIndex;

        if(canMove()) move();

    }

}
