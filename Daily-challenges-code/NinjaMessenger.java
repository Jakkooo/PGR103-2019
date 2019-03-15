//Solution by Cytlan

import java.util.Random;
import java.util.Scanner;

public class NinjaMessenger
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Ninja Messenger");
        System.out.println("==========================");
        System.out.println("Write a message to Ninja:");
        scanner.nextLine(); // We don't care about the message really :)

        scanner.useDelimiter(""); // So that we only get a single character from scanner.next() below

        Random rand = new Random();
        boolean goodNinja = rand.nextInt(2) == 1;

        if(goodNinja)
        {
            System.out.println("You sent the message to Youtube Ninja!");
            System.out.println("> Thanks for the message :)");
            System.out.print("Send him a friend request? [y/N] ");
            String resp = scanner.next();
            if(resp.toLowerCase().equals("y"))
            {
                System.out.println("Youtube Ninja accepted your friend request!");
            }
            else
            {
                System.out.println("Maybe later...");
            }
        }
        else
        {
            System.out.println("You sent the message to the Real, One and Only Ninja!");
            System.out.println("> Stop bothering me!");
            System.out.print("Say sorry? [y/N] ");
            String resp = scanner.next();
            if(resp.toLowerCase().equals("y"))
            {
                System.out.println("> Apology accepted. Now disappear.");
            }
            else
            {
                System.out.println("You throw your computer out the window, move to Mexico and change your name to Guillermo, just to be safe.");
            }
        }
    }
}