// The capital city of Berland contains Theatre Square, which possesses a rectangular layout with dimensions n × m meters. In honor of the city's anniversary, the decision was made to embellish the square using granite flagstones that are all square and have dimensions a × a.

// What is the minimum quantity of these flagstones required to completely cover Theatre Square? It is permissible to extend the coverage beyond the borders of Theatre Square, but the square itself must be entirely covered. It is essential to note that the flagstones cannot be broken and must be positioned in a manner where their edges align with the edges of Theatre Square.

// Input Format

// The initial line of input includes three positive integer values: n, m, and a (1 ≤  n, m, a ≤ 109).

// Constraints

// .

// Output Format

// You should output the minimum count of flagstones needed to accomplish the paving task.

// Sample Input 0

// 6 6 4
// Sample Output 0

// 4

import java.io.*;
import java.util.*;

public class problem7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        short n = sc.nextShort();
        short m = sc.nextShort();
        short a = sc.nextShort();

        System.out.println((int) Math.ceil((double) n / a) * (int) Math.ceil((double) m / a));
    }
}
