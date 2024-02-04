import java.util.Scanner;

public class ReversedStrings {
    public static void main(String[] args) {

        // Use the scanner class
        Scanner myScanner = new Scanner(System.in);
        System.out.println("\n\nType some text, please, and I'll reverse it!");
        // Assign the scanner class input into the userText String variable
        String userText = myScanner.nextLine();
        // Closing the scanner to prevent resource leak
        myScanner.close();
        // Use the StringBuffer class, passing the userText variable into a myStringBuffer variable
        StringBuffer myStringBuffer = new StringBuffer(userText);
        // Use the reverse function of the StringBuffer class to reverse the text on myStringBuffer
        myStringBuffer.reverse();
        // Output the reversed text to the screen
        System.out.println("\nYour reversed text is: " + myStringBuffer.toString());
    }
}