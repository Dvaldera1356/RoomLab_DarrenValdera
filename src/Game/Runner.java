package Game;

import People.Person;
import Rooms.Bathroom;
import Rooms.Room;
import Rooms.WinningRoom;
import java.util.Scanner;
public class Runner {
    private static boolean ON = true;

    public static void main(String[] args)
    {
        Room[][] building = new Room[5][5];


        for (int a = 0; a<building.length; a++)
        {
            for (int b = 0; b < building[a].length; b++)
            {
                building[a][b] = new Room(a,b);
            }
        }

        int a = (int)(Math.random()*building.length);
        int b = (int)(Math.random()*building.length);
        building[a][b] = new WinningRoom(a, b);


        int aa = (int)(Math.random()*building.length);
        int bb = (int)(Math.random()*building.length);
        building[aa][bb] = new Bathroom(aa, bb);


        Person player1 = new Person("FirstName", "FamilyName", 0,0);
        building[0][0].enterRoom(player1);
        Scanner in = new Scanner(System.in);
        while(ON)
        {
            System.out.println("Where would you like to move? (Choose North, South, East, West)");
            String move = in.nextLine();
            if(validMove(move, player1, building))
            {
                System.out.println("Your coordinates: row = " + player1.getxLoc() + " col = " + player1.getyLoc());

            }
            else {
                System.out.println("Please choose a valid move.");
            }


        }
        in.close();
    }


    public static boolean validMove(String move, Person p, Room[][] map)
    {
        move = move.toLowerCase().trim();
        switch (move) {
            case "North":
                if (p.getxLoc() > 0)
                {
                    map[p.getxLoc()][p.getyLoc()].leaveRoom(p);
                    map[p.getxLoc()-1][p.getyLoc()].enterRoom(p);
                    return true;
                }
                else
                {
                    return false;
                }
            case "East":
                if (p.getyLoc()< map[p.getyLoc()].length -1)
                {
                    map[p.getxLoc()][p.getyLoc()].leaveRoom(p);
                    map[p.getxLoc()][p.getyLoc() + 1].enterRoom(p);
                    return true;
                }
                else
                {
                    return false;
                }

            case "South":
                if (p.getxLoc() < map.length - 1)
                {
                    map[p.getxLoc()][p.getyLoc()].leaveRoom(p);
                    map[p.getxLoc()+1][p.getyLoc()].enterRoom(p);
                    return true;
                }
                else
                {
                    return false;
                }

            case "West":
                if (p.getyLoc() > 0)
                {
                    map[p.getxLoc()][p.getyLoc()].leaveRoom(p);
                    map[p.getxLoc()][p.getyLoc()-1].enterRoom(p);
                    return true;
                }
                else
                {
                    return false;
                }
            default:
                break;

        }
        return true;
    }
    public static void OFF()
    {
        ON = false;
    }



}

