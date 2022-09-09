package GridWorld.GridCode.SelfBug;

import info.gridworld.actor.Bug;

public class SpiralBug extends Bug{
    
    private int curLen;
    private int maxLen;

    public SpiralBug(int maxL){
        curLen = 0;
        maxLen = maxL;
    }

    @Override
    public void act(){

        if(curLen < maxLen && canMove()){
            ++curLen;
            move();
        }
        else{
            ++maxLen;
            turn();
            turn();
            curLen = 0;
        }

    }

}
