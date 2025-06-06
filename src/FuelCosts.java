import java.util.Scanner; // before the class at top of the file

public class FuelCosts
{
    public static void main(String[] args)
    {
        // this code in main:
        Scanner in = new Scanner(System.in);
        double numGallons = 0;
        double milesPerGallon = 0;
        double pricePerGallon = 0;
        double costDrive = 0;
        double distanceFull = 0;
        String trash = ""; // use for bad input which will read as a String
        boolean done = false;

        do
        {
            System.out.print("How many gallons of gas are in the tank? ");
            if(in.hasNextDouble()) // OK safe to read in a double
            {
                numGallons = in.nextDouble();
                in.nextLine(); // clears the newline from the buffer
                done = true; // we got a valid number so we can end the loop
            }
            else
            {
                // Not a double so use nextLine() instead to read a String
                trash = in.nextLine();
                System.out.println("\nYou said the tank has " + trash + " gallons of gas.");
                System.out.println("You have to enter a valid number of gallons!\n");
            }
        }while(!done); // initially done is false so !done i.e. NOT FALSE, is true
        // when done is true !done i.e. NOT TRUE is false

        done = false;
        do
        {
            System.out.print("What is the fuel efficiency in miles per gallon? ");
            if(in.hasNextDouble()) // OK safe to read in a double
            {
                milesPerGallon = in.nextDouble();
                in.nextLine(); // clears the newline from the buffer
                done = true; // we got a valid number so we can end the loop
            }
            else
            {
                // Not a double so use nextLine() instead to read a String
                trash = in.nextLine();
                System.out.println("\nYou said the fuel efficiency is " + trash + " miles per gallon.");
                System.out.println("You have to enter a valid number of miles per gallon!\n");
            }
        }while(!done); // initially done is false so !done i.e. NOT FALSE, is true
        // when done is true !done i.e. NOT TRUE is false

        done = false;
        do
        {
            System.out.print("What is the price of gas per gallon? ");
            if(in.hasNextDouble()) // OK safe to read in a double
            {
                pricePerGallon = in.nextDouble();
                in.nextLine(); // clears the newline from the buffer
                done = true; // we got a valid number so we can end the loop
            }
            else
            {
                // Not a double so use nextLine() instead to read a String
                trash = in.nextLine();
                System.out.println("\nYou said the cost of gas is " + trash + " dollars per gallon.");
                System.out.println("You have to enter a valid price per gallon!\n");
            }
        }while(!done); // initially done is false so !done i.e. NOT FALSE, is true
        // when done is true !done i.e. NOT TRUE is false

        costDrive = pricePerGallon * (100 / milesPerGallon);
        distanceFull = numGallons * milesPerGallon;

        System.out.printf("\nThe cost to drive 100 miles is %5.2f dollars.", costDrive);
        System.out.println("\nThe distance the car can go with a full tank is " + distanceFull + " miles.");
    }
}
