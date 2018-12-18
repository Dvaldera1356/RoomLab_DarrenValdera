package Rooms;

import People.Person;

public class Room {
    Person occupant;
    int xLoc,yLoc;

    public Room(int a, int b)
    {
        xLoc = a;
        yLoc = b;
    }


    public void enterRoom(Person x)
    {
        System.out.println("You have entered a plain old room.");
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
    }

    public void leaveRoom(Person x)
    {
        occupant = null;
    }

}
