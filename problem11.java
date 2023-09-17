// According to an old legeng, a long time ago Ankh-Morpork residents did something wrong to miss Fortune, and she cursed them. She said that at some time n snacks of distinct sizes will fall on the city, and the residents should build a Snacktower of them by placing snacks one on another. Of course, big snacks should be at the bottom of the tower, while small snacks should be at the top.

// Years passed, and once different snacks started to fall onto the city, and the residents began to build the Snacktower.

// However, they faced some troubles. Each day exactly one snack fell onto the city, but their order was strange. So, at some days the residents weren't able to put the new stack on the top of the Snacktower: they had to wait until all the bigger snacks fell. Of course, in order to not to anger miss Fortune again, the residents placed each snack on the top of the tower immediately as they could do it.

// Write a program that models the behavior of Ankh-Morpork residents.

// Input Format

// The first line contains single integer n (1 ≤ n ≤ 100 000) — the total number of snacks.

// The second line contains n integers, the i-th of them equals the size of the snack which fell on the i-th day. Sizes are distinct integers from 1 to n.

// Constraints

// Note: In the example a snack of size 3 fell on the first day, and the residents immediately placed it. On the second day a snack of size 1 fell, and the residents weren't able to place it because they were missing the snack of size 2. On the third day a snack of size 2 fell, and the residents immediately placed it. Right after that they placed the snack of size 1 which had fallen before.

// Output Format

// Print n lines. On the i-th of them print the sizes of the snacks which the residents placed on the top of the Snacktower on the i-th day in the order they will do that. If no snack is placed on some day, leave the corresponding line empty.

// Sample Input 0

// 3
// 3 1 2
// Sample Output 0

// 3
 
// 2 1
// Sample Input 1

// 5
// 4 5 1 2 3
// Sample Output 1

// 5 4 


// 3 2 1

import java.util.Scanner;

public class problem11 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] snacks = new int[n];

        for(int i = 0; i < n; i++) {
            snacks[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++) {
            if(snacks[i] == n) {
                System.out.println(snacks[i]);
            } else {
                System.out.println();
            }

            while(i < n && snacks[i] == n - i) {
                System.out.print(snacks[i] + " ");
                i++;
            }
        }
    }
}