package GridWorld.GridCode.SelfBug;

import info.gridworld.actor.Bug;

public class CircleBug extends Bug{
    
    private int stepLen;
    private int curLen;

    public CircleBug(int stLen){
        stepLen = stLen;
        curLen = 0;
    }

    @Override
    public void act(){

        if(curLen < stepLen && canMove()){
            move();
            ++curLen;
        }
        else{
            turn();
            curLen = 0;
        }

    }

}
