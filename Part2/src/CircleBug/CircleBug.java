package CircleBug;
import info.gridworld.actor.Bug;
import static java.awt.SystemColor.info;

public class CircleBug extends Bug {
    
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
