import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] A = new int[N];
        int minnum = 1000000000;
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        Arrays.sort(A);
        for (int i = N - K - 1; i < N; i++) {
            int num = A[i] - A[(i - (N - K) + 1)];
            if (num < minnum) {
                minnum = num;
            }
        }
        System.out.println(minnum);
    }
}
