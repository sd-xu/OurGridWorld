import info.gridworld.actor.Bug;

public class ZShapeBug extends Bug{
    
    private int curLen;
    private int maxLen;
    private int turn;


    public ZShapeBug(int maxL){
        curLen = turn = 0;
        maxLen = maxL;
        setDirection(90);
    }

    @Override
    public void act(){

        if (canMove()) {
           if (curLen < maxLen) {
              curLen++;
              move();
           } else {
             switch(turn) {
                   case 0:
                     setDirection(225);
                     break;
                   case 1:
                     setDirection(90);
                     break;
                   default:
                     maxLen = 0;
                     curLen = 0;
                     return;
             }
            turn++;
            curLen = 0;
           }
         }

    }

}
