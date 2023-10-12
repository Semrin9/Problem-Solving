import java.io.*;
import java.util.*;

public class problem15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String A = sc.next();
            String B = sc.next();

            int gcdLength = gcd(A.length(), B.length());
            String gcdString = A.substring(0, gcdLength);

            if (isDivisor(A, gcdString) && isDivisor(B, gcdString)) {
                System.out.println(gcdLength);
            } else {
                System.out.println(-1);
            }
        }
    }

    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    private static boolean isDivisor(String S, String T) {
        int SLength = S.length();
        int TLength = T.length();
        if (SLength % TLength != 0) {
            return false;
        }

        int repeats = SLength / TLength;
        StringBuilder repeatedT = new StringBuilder(T.repeat(repeats));

        return repeatedT.toString().equals(S);
    }
}