import java.util.Scanner;

public class MadnessWithMethods {

        public static void main(String[] args) {

            // Run the method to gather the input
            getAnIntFromTheUser();
    }

    public static void getAnIntFromTheUser() {

        // Output the request to the screen for an integer
        System.out.println("\n\nPlease enter an integer and hit ENTER.");
        // Create and use the scanner class, pulling the user's integer
        Scanner myScanner = new Scanner(System.in);
        int userInt = myScanner.nextInt();
        // Close the scanner to prevent resource leak
        myScanner.close();
        // Assign a static integer variable to compare against and to add later
        int staticInt = 50;


        // run the first method, passing the user's variable and the static variable as parameters
        compareTwoInts(userInt, staticInt);
        // run this method after completing the previous method, also passing along the variables as parameters
        sumTwoInts(userInt, staticInt);

    }

    public static void compareTwoInts(int userInt, int staticInt) {

        // Use if/then to check and see if the user's variable is  greater than, less than or equal
        // to the static variable and then print the appropriate response to the screen.  When complete
        // it'll jump back to getAnIntFromTheUser and run the second method, sumTwoInts().

        if (userInt == staticInt) {
            System.out.println("\n\nMy number was " + staticInt + ".  We have the same number!");
        }

        if (userInt > staticInt) {
            System.out.println("\n\nMy number was " + staticInt + ".  You have a higher number!");
        }

        if (userInt < staticInt) {
            System.out.println("\n\nMy number was " + staticInt + ".  You have a lower number!");
        }

    }

    public static void sumTwoInts(int userInt, int staticInt) {

        // pull in the two variables as parameters in the method, and then assign the sum to mySum
        int mySum = userInt + staticInt;
        // Output the sum
        System.out.println("\n\nThe sum of these two numbers is: " + mySum);
    }

}