import java.util.Arrays;
import java.util.Scanner;

public class problem12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[m];
        int input;

        for (int i = 0; i < m; i++) {
            input = sc.nextInt();
            arr[i] = input;
        }

        Arrays.sort(arr);

        int min = Integer.MAX_VALUE;

        for (int i = 0; i <= m - n; i++) {
            int difference = arr[i + n - 1] - arr[i];
            min = Math.min(min, difference);
        }

        System.out.println(min);
    }
}