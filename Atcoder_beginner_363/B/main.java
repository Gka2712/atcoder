import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int T = sc.nextInt();
        int P = sc.nextInt();
        int match = 0;
        int[] L = new int[N];
        for (int i = 0; i < N; i++) {
            L[i] = sc.nextInt();
        }
        Arrays.sort(L);
        if (L[N-P] >= T) {
            System.out.println(0);
            return;
        }
        for (int i = N - 1; i >= 0; i--) {
            match += 1;
            if (match == P) {
                System.out.println(T - L[i]);
                return;
            }
        }
    }

}
