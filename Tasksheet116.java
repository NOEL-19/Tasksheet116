
import java.util.Scanner;
public class Tasksheet116{
    public static void main(String[] args) {
        
         // Create a scanner object to take input
         Scanner scanner = new Scanner(System.in);

         // Prompt user to enter a string
         System.out.print("Enter a string: ");
         String input = scanner.nextLine();
 
         // Create a new StringBuilder with the input string
         StringBuilder reversedString = new StringBuilder(input);
 
         // Reverse the string
         reversedString.reverse();
 
         // Check if the input string and the reversed string are the same
         if (input.equals(reversedString.toString())) {
             System.out.println("The input string is a palindrome.");
         } else {
             System.out.println("The input string is not a palindrome.");
         }
 
         // Close the scanner
         scanner.close();


    }



}
