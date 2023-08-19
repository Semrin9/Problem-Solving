import java.io.*;
import java.util.*;

public class problem4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String input = scanner.nextLine();
        
        String target = "Pass";
        
        int i = 0; // Index for input
        int j = 0; // Index for target
        
        while (i < input.length() && j < target.length()) {
            if (input.charAt(i) == target.charAt(j)) {
                j++;
            }
            i++;
        }
        // Check if the target string was completely matched
        if (j == target.length()) {
            System.out.println("Well done you passed the course!");
        } else {
            System.out.println("You failed the course!");
        }
        
        scanner.close();
    }
}