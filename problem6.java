// As per Wikipedia, FizzBuzz is a word game aimed at educating children about division. It's unclear whether this information is accurate, but in the realm of programming interviews, this question is commonly employed to challenge and evaluate recent computer science graduates.

// The fundamental idea is as follows: You display a sequence of numbers from 1 to N, while substituting any number divisible by X with "Fizz," and replacing numbers divisible by Y with "Buzz." In cases where a number is divisible by both X and Y, the output is changed to "FizzBuzz."

// Input Format

// The input file will encompass a solitary test scenario. Within this test case, three integers will be provided on a solitary line: X, Y, and N (where 1 < X < Y < N < 100).

// Constraints

// .

// Output Format

// Output the sequence of integers from 1 to N, one on each line, while substituting numbers divisible by X with "Fizz," those divisible by Y with "Buzz," and numbers divisible by both X and Y with "FizzBuzz."

// Sample Input 0

// 3 5 15
// Sample Output 0

// 1
// 2
// Fizz
// 4
// Buzz
// Fizz
// 7
// 8
// Fizz
// Buzz
// 11
// Fizz
// 13
// 14
// FizzBuzz

import java.io.*;
import java.util.*;

public class problem6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int X = scanner.nextInt();
        int Y = scanner.nextInt();
        int N = scanner.nextInt();
        
        if (1 < X && X < Y && Y < N && N < 100) {
            for (int i = 1; i <= N; i++) {
                if (i % X == 0 && i % Y == 0) {
                    System.out.println("FizzBuzz");
                } else if (i % X == 0) {
                    System.out.println("Fizz");
                } else if (i % Y == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
            }
        }

        scanner.close();    
    }
}
