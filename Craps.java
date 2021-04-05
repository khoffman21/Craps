
/**
 * Write a description of class Craps here.
 *
 * @author Katie Hoffman
 * @version 2020-02-08
 */
import java.util.Scanner;
public class Craps
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner (System.in);
        Die d1 = new Die();
        Die d2 = new Die();
        boolean playing = true;
        while(playing) 
        {
        System.out.println("Let's play craps, Do you need instructions (y/n)?");
        String explain = in.nextLine();
        if (explain.equals("y"))
        {
            System.out.println("A player rolls two six-sided dice and adds the numbers rolled together.");
            System.out.println("On this first roll, a 7 or an 11 automatically wins, and a 2, 3, or 12 automatically loses, and play is over."); 
            System.out.println("If a 4, 5, 6, 8, 9, or 10 are rolled on this first roll, that number becomes the 'point.'");
            System.out.println("The player continues to roll the two dice again until either they roll the point from that first roll again, in which case they win; or they roll a 7, in which case they lose.");
        }
            System.out.println("Press <Enter> to roll the dice...");
            in.nextLine();
            int total = d1.roll() + d2.roll();
            System.out.println("Your first roll is: " + total);
            if (total == 7 || total == 11)
            {
                System.out.println("You won!"); 
            }
            else if (total == 2 || total == 3 || total == 12)
            {
                System.out.println("You lost... better luck next time");
            }
            else
            {

                int point = total;
                total = d1.roll() + d2.roll();
                System.out.println("next round! press <Enter> to roll the dice");
                in.nextLine();
                System.out.println("Your next roll is: " + total);
                while (total != 7 && total != point)
                {
                    
                    System.out.println("next round! press <Enter> to roll the dice");
                in.nextLine();
                
                total = d1.roll() + d2.roll();
                System.out.println("You rolled a " + total);
                }
                if (total == point)
                {
                    System.out.println("You won!!");
                }
                else if (total == 7)
                {
                    
                    System.out.println("You lost...");
                }
            }
           System.out.println("Would you like to play again? (y/n)");
           String playAgain = in.nextLine();
           if (playAgain.equals("n"))
           {
               System.out.println("Goodbye!");
               break;
           }
        }
    }
}


/* 

COMMENTS FROM THE INSTRUCTOR:

This is a really nice version of this program, Katie. There is a single, 
small suggestion--having to say that you don't want to read the instructions
everytime you play is a little annoying. Otherwise, outstanding work!

SCORE: 15/15

*/

