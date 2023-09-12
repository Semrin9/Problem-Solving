// A few years back, Mohamad decided to switch schools due to security concerns. Presently, he has a desire to locate his friend Amir, who was a close companion back in his previous school.

// There are n schools, numbered from 1 to n. It's possible to travel between any pair of schools by purchasing a ticket, which costs . This ticket can be utilized multiple times for travel between schools i and j. Mohamad needs assistance in determining the most economical way to cover the cost of tickets required to visit all the schools. He has the flexibility to initiate his journey from any school and conclude it at any other school.

// Input Format

// The initial line of input contains a single integer n (1 ≤ n ≤ 105) — indicating the total number of schools.

// Constraints

// .

// Output Format

// Print a single integer, representing the minimum expense Sajjad has to bear for purchasing tickets to visit all the schools.

// Sample Input 0

// 10
// Sample Output 0

// 4
// Explanation 0

// Note: In the first example we can buy a ticket between the schools that costs (1+2)mod(2+1)=0

import java.util.Scanner;

public class problem8 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println((n -1) /2);
    }
}
