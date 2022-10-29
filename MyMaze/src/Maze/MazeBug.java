package Maze;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Stack;

public class MazeBug extends Bug {
    public Location next;
    public Location last;
    public boolean isEnd = false;
    public Stack<ArrayList<Location>> crossLocation = new Stack();
    public Integer stepCount = 0;
    boolean hasShown = false;

    public MazeBug() {
        this.setColor(Color.GREEN);
        this.last = new Location(0, 0);
    }

    @Override
    public void act() {
        boolean var1 = this.canMove();
        if (this.isEnd) {
            if (!this.hasShown) {
                String var2 = this.stepCount.toString() + " steps";
                JOptionPane.showMessageDialog((Component)null, var2);
                this.hasShown = true;
            }
        } else if (var1) {
            this.move();
            Integer var4 = this.stepCount;
            Integer var3 = this.stepCount = this.stepCount + 1;
        }

    }

    public ArrayList<Location> getValid(Location var1) {
        Grid var2 = this.getGrid();
        if (var2 == null) {
            return null;
        } else {
            ArrayList var3 = new ArrayList();
            return var3;
        }
    }

    public boolean canMove() {
        return false;
    }

    public void move() {
        Grid var1 = this.getGrid();
        if (var1 != null) {
            Location var2 = this.getLocation();
            if (var1.isValid(this.next)) {
                this.setDirection(this.getLocation().getDirectionToward(this.next));
                this.moveTo(this.next);
            } else {
                this.removeSelfFromGrid();
            }

            Flower var3 = new Flower(this.getColor());
            var3.putSelfInGrid(var1, var2);
        }
    }
}

