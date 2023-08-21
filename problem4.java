// After hardworking of the student in programming course, instructor decides to send the result as meaningless string for each student as funny programming trick.

// Student figures that if and only if, she/he can delete several characters from the message sent by his/her instructor, resulting in the word "Pass", it will be considered that student pass this course, and if not student will fail in the course!

// Input Format

// String of (0-9), charecters(A-Z, a-z) and any spacial characters.

// Constraints

// .

// Output Format

// One line contine a one of this result's: (You failed the course!) OR (Well done you passed the course!).

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