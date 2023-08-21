// Two cats (Tom and Ben) and a mouse (Jerry) are at different positions on a line. You will be given their starting positions. Your task is to determine which cat will reach the mouse first, assuming the mouse does not move and the cats travel at equal speed. If the cats arrive at the same time, the mouse will be allowed to move and it will escape while they fight.

// You are given q queries in the form of x, y, and z representing the respective positions for cats Tom and Ben, and for mouse Jerry. Complete the function to return the appropriate answer to each query, which will be printed on a new line.

// If cat catches the mouse first, print Tom. If cat catches the mouse first, print Ben. If both cats reach the mouse at the same time, print Jerry as the two cats fight and mouse escapes.

// Example x = 2 y = 5 z = 4

// The cats are at positions 2 (Tom) and 5 (Ben), and Jerry is at position 4. Ben, at position 4 will arrive first since it is only unit away while the other is 2 units away. Return 'Ben'.

// Input Format

// The first line contains a single positive integer, q, denoting the number of queries. Each of the q subsequent lines contains three space-separated integers describing the respective values of x (Tom's location), y (Ben's location), and z (Jerry's location).

// Constraints

// 1 <= q <= 100

// -100 <= x,y,z <=100

// Output Format

// A string that shows the result

// Sample Input 0

// 1
// 2 5 4
// Sample Output 0

// Ben

import java.io.*;
import java.util.*;

public class problem5 {
public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        short q = sc.nextShort(); 
        
        for (int i = 0; i < q; i++) {
            short x = sc.nextShort(); // Tom's position
            int y = sc.nextShort(); // Ben's position
            int z = sc.nextShort(); // Jerry's position
            
            String result = catAndMouse(x, y, z);
            System.out.println(result);
        }
        
        sc.close();
    }
    
    public static String catAndMouse(int x, int y, int z) {
        int distanceToTom = Math.abs(z - x);
        int distanceToBen = Math.abs(z - y);
        
        if (distanceToTom < distanceToBen) {
            return "Tom";
        } else if (distanceToBen < distanceToTom) {
            return "Ben";
        } else {
            return "Jerry";
        }
    }
}
