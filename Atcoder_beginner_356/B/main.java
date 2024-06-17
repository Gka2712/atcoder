import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int[] A = new int[M];
    int[][] X = new int[N][M];
    int[] Xsum = new int[M];
    for (int i = 0; i < M; i++) {
      A[i] = sc.nextInt();
    }
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < M; j++) {
        X[i][j] = sc.nextInt();
        Xsum[j] += X[i][j];
      }
    }
    for (int i = 0; i < M; i++) {
      if (A[i] > Xsum[i]) {
        System.out.println("No");
        return;
      }
    }
    System.out.println("Yes");
  }
}