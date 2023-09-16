// Hussien has two strings A, B he can make only one operation that can swap any two letters in the String A.

// Given two strings A, B if Hussien can make them equal print "YES", otherwise print "NO".

// Input Format

// Two lines of the input contains two strings A in the first line, and B in the second line, (2≤|A|,|B|≤105).

// Constraints

// Note: Hussien will make this operation exactly one.

// Output Format

// print "YES" if he can make them equal otherwise print "NO".

// Sample Input 0

// aba
// aab
// Sample Output 0

// YES
// Sample Input 1

// abc
// def
// Sample Output 1

// NO

import java.util.*;

public class problem9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();

        if (A.length() != B.length()) {
            System.out.println("NO");
            return;
        }

        int[] diff = new int[2];
        int diffCount = 0;
        
        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) != B.charAt(i)) {
                if (diffCount >= 2) {
                    System.out.println("NO");
                    return;
                }
                diff[diffCount++] = i;
            }
        }
        
        if (diffCount == 2) {
            if (A.charAt(diff[0]) == B.charAt(diff[1]) &&
                A.charAt(diff[1]) == B.charAt(diff[0])) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        } else {

            System.out.println("NO");
        }
    }
}