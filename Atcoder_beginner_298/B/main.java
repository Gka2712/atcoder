import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] A = new int[N][N];
        int[][] B = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                B[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < 4; i++) {
            boolean resultYes = true;
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < N; k++) {
                    if (A[j][k] == 1 && B[j][k] != 1) {
                        resultYes = false;
                    }
                }
            }
            if (resultYes) {
                System.out.println("Yes");
                return;
            }
            int[][] res = new int[N][N];
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < N; k++) {
                    res[N - 1 - k][j] = A[j][k];
                }
            }
            A = res;
        }
        System.out.println("No");
    }

}
