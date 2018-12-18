package Rooms;
import Game.Runner;
import People.Person;

public class Bathroom extends Room {

    public Bathroom(int x2, int y2) {
        super(x2, y2);

    }

    public void enterRoom(Person x2) {

        occupant = x2;
        x2.setxLoc(this.xLoc);
        x2.setyLoc(this.yLoc);
        System.out.println("You found the bathroom. There seems to be nothing in here.");
        Runner.OFF();
    }
}
