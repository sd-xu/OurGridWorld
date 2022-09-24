package Jumper;

import info.gridworld.actor.Actor;
import info.gridworld.actor.Flower;
import info.gridworld.actor.Rock;
import info.gridworld.actor.Bug;

import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

import java.awt.Color;

import java.util.*;

public class Jumper extends Actor
{
//
    public Jumper()
    {
        setColor(Color.RED);
    }

    public Jumper(Color bugColor)
    {
        setColor(bugColor);
    }

    public void act()
    {
        if (canMove()) {
            move();
        }
        else {
            turn();
        }
    }


    public void turn()
    {
        setDirection(getDirection() + Location.HALF_RIGHT);
    }


    public void move()
    {
        Grid<Actor> gr = getGrid();
        if (gr == null) {
            return;
        }
        Location loc = getLocation();
        Location next = loc.getAdjacentLocation(getDirection());
        Location nnext = next.getAdjacentLocation(getDirection());
        if (!gr.isValid(next)) {
            removeSelfFromGrid();
            return;
        }
        if (gr.isValid(nnext)) {
            moveTo(nnext);
        }
        else {
            removeSelfFromGrid();
        }
    }

    public boolean canMove()
    {
        Grid<Actor> gr = getGrid();
        if (gr == null) {
            return false;
        }
        Location loc = getLocation();
        Location next = loc.getAdjacentLocation(getDirection());
        if (!gr.isValid(next)) {
            return false;
        }
        Actor neighbor = gr.get(next);
        if (neighbor instanceof Bug) {
            return false;
        }

        Location nnext = next.getAdjacentLocation(getDirection());
        if (!gr.isValid(nnext)) {
            return false;
        }
        neighbor = gr.get(nnext);
        return (neighbor == null) || (neighbor instanceof Flower);
    }
}