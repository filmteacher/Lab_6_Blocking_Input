import java.util.Scanner; // before the class at top of the file

public class CtoFConverter
{
    public static void main(String[] args)
    {
        // this code in main:
        Scanner in = new Scanner(System.in);
        double tempCelcius = 0;
        double tempFarenheit = 0;
        String trash = ""; // use for bad input which will read as a String
        boolean done = false;

        do
        {
            System.out.print("What is the temperature in Celcius? "); // OUTPUT "What is the temperature in Celcius?"
            // INPUT tempCelcius
            if(in.hasNextDouble()) // OK safe to read in a double
            {
                tempCelcius = in.nextDouble();
                in.nextLine(); // clears the newline from the buffer
                done = true; // we got a valid number so we can end the loop
            }
            else
            {
                // Not a double so use nextLine() instead to read a String
                trash = in.nextLine();
                System.out.println("\nYou said the temperature in Celcius was: " + trash);
                System.out.println("You have to enter a valid Celcius temperature!");
            }
        }while(!done); // initially done is false so !done i.e. NOT FALSE, is true
        // when done is true !done i.e. NOT TRUE is false

        tempFarenheit = (tempCelcius * 9/5) + 32; // tempFarenheit = (tempCelcius × 9/5) + 32
        // OUTPUT "The temperature in Farenheit is " + tempCelcius
        System.out.println("\nThe temperature you entered in Celcius was " + tempCelcius + " degrees.");
        System.out.println("\nThis is " + tempFarenheit + " degrees in Farenheit.");
    }
}
