import java.util.Scanner;

public class problem13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int b = sc.nextInt();
        int d = sc.nextInt();
        
        int[] oranges = new int[n];
        for (int i = 0; i < n; i++) {
            oranges[i] = sc.nextInt();
        }
        
        int size = 0;
        int empty = 0;
        
        for (int i = 0; i < n; i++) {
            if (oranges[i] <= b) {
                size += oranges[i];
                
                if (size > d) {
                    empty++;
                    size = 0;
                }
            }
        }
        
        System.out.println(empty);
    }
}
