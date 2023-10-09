import java.util.*;

public class problem14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        for (int t = 0; t < T; t++) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            
            // If K is 1 or N is even, Omda will win.
            if (N % 2 == 0 || K == 1 ) {
                System.out.println("Omda");
            } else {
                System.out.println("Teemo");
            }
        }
    }
}
