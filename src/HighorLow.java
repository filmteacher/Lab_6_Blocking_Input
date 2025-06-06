import java.util.Scanner; // before the class at top of the file
import java.util.Random;  // at the top before the main
import java.util.random.RandomGenerator;

public class HighorLow
{
    public static void main(String[] args)
    {
        // this code in main:
        Scanner in = new Scanner(System.in);
        Random generator = new Random();
        int val = generator.nextInt(10) + 1; // val is 1 to 10
        int guess = 0;
        String trash = ""; // use for bad input which will read as a String
        boolean done = false;

        do
        {
            System.out.print("Guess a number between 1 and 10: ");
            if(in.hasNextInt()) // OK safe to read in an int
            {
                guess = in.nextInt();
                in.nextLine(); // clears the newline from the buffer

                if(guess >= 1 && guess <= 10) // if guess is in the legal range
                {
                    done = true; // we got a valid number so we can end the loop
                }
            }
            else
            {
                // Not a valid int between 1 and 10 so use nextLine() instead to read a String
                trash = in.nextLine();
                System.out.println("\nYou said your guess was: " + trash + ".");
                System.out.println("You have to enter a valid integer between 1 and 10!");
            }
        }while(!done); // initially done is false so !done i.e. NOT FALSE, is true
        // when done is true !done i.e. NOT TRUE is false

        System.out.println("\nThe random number is " + val + ".");

        if(guess == val)
        {
            System.out.println("\nYou were right on the money!");
        }
        else if(guess > val)
        {
            System.out.println("\nYou were too high!");
        }
        else
        {
            System.out.println("\nYou were too low!");
        }
    }
}
