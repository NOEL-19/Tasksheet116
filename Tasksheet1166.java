
import java.util.*;
public class Tasksheet1166 {
    public static void main(String[] args) {
        
        String input= "wow";
        StringBuilder sb =  new StringBuilder (input);

        String reverseString = sb.reverse().toString();

        if (input.equals(reverseString.toString())) {
            System.out.println("The input string is a palindrome.");
        } else {
            System.out.println("The input string is not a palindrome.");
        }


    }
}
