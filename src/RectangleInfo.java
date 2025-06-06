import java.util.Scanner;// before the class at top of the file

public class RectangleInfo
{
    public static void main(String[] args)
    {
        // this code in main:
        Scanner in = new Scanner(System.in);
        double width = 0;
        double height = 0;
        double area = 0;
        double perimeter = 0;
        double diagonal = 0;
        String trash = ""; // use for bad input which will read as a String
        boolean done = false;

        do
        {
            System.out.print("What is the width of the rectangle? ");
            if(in.hasNextDouble()) // OK safe to read in a double
            {
                width = in.nextDouble();
                in.nextLine(); // clears the newline from the buffer
                done = true; // we got a valid number so we can end the loop
            }
            else
            {
                // Not a double so use nextLine() instead to read a String
                trash = in.nextLine();
                System.out.println("\nYou said the width was " + trash + ".");
                System.out.println("You have to enter a valid width!\n");
            }
        }while(!done); // initially done is false so !done i.e. NOT FALSE, is true
        // when done is true !done i.e. NOT TRUE is false

        done = false;
        do
        {
            System.out.print("What is the height of the rectangle? ");
            if(in.hasNextDouble()) // OK safe to read in a double
            {
                height = in.nextDouble();
                in.nextLine(); // clears the newline from the buffer
                done = true; // we got a valid number so we can end the loop
            }
            else
            {
                // Not a double so use nextLine() instead to read a String
                trash = in.nextLine();
                System.out.println("\nYou said the height of the rectangle is " + trash + ".");
                System.out.println("You have to enter a valid height!\n");
            }
        }while(!done); // initially done is false so !done i.e. NOT FALSE, is true
        // when done is true !done i.e. NOT TRUE is false

        area = width * height;
        perimeter = (2 * width) + (2 * height);
        diagonal = Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));

        System.out.printf("\nThe area of the rectangle is %5.2f.", area);
        System.out.printf("\nThe perimeter of the rectangle is %5.2f.", perimeter);
        System.out.printf("\nThe length of the diagonal is %5.2f.", diagonal);
    }
}
