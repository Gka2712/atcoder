import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] A = new int[M];
        int[] P = new int[N];
        for (int i = 0; i < M; i++) {
            A[i] = sc.nextInt();
            if (A[i] == 1 || A[i] == N) {
                System.out.println("-1");
                return;
            }
        }
        Arrays.sort(A);
        for (int i = 0; i < N; i++) {
            P[i] = i + 1;
        }
        for (int i = 0; i < M; i++) {
            // P[i]とP[i+1]のデータの交換
            int data = P[A[i] - 1];
            P[A[i] - 1] = P[A[i]];
            P[A[i]] = data;
        }
        for (int i = 0; i < N; i++) {
            System.out.print(P[i] + " ");
        }
    }
}