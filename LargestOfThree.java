import java.util.Scanner;  
public class LargestOfThree  
{  
public static void main(String[] args)   {  
  
    getIntsFromUser();
}  

public static void getIntsFromUser() {

    int first, second, third;  
    //object of the Scanner class  
    Scanner myScanner = new Scanner(System.in);  
    //reading input from the user  
    System.out.println("Enter your first number:");  
    first = myScanner.nextInt();  
    System.out.println("Enter your second number:");  
    second = myScanner.nextInt();  
    System.out.println("Enter your third number:");  
    third = myScanner.nextInt();  

    makeComparison(first, second, third);
}

public static void makeComparison(int first, int second, int third) {

    int largest, compared;

// Used the ternary operator to compare the first and second user variables, saving the result in the compared variable  
compared = (first > second) ? first : second;  
// Now comparing the third variable with the results from the first ternary operation, saving that result into
// the largest variable  
largest = (third > compared) ? third : compared;  
// Outputs the largest variable to the screen  
System.out.println("The largest number is: " + largest);
}

}  