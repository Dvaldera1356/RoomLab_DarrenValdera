package Rooms;

import Game.Runner;
import People.Person;

public class WinningRoom extends Room
{

    public WinningRoom(int x, int y) {
        super(x, y);

    }

    public void enterRoom(Person x) {

        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
        System.out.println("You found the winning room! Ten points for Gryffindor.");
        Runner.OFF();
    }


}
