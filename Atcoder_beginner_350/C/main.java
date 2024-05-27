// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] A = new int[N];
    for (int i = 0; i < N; i++) {
      A[i] = sc.nextInt();
    }
    int count = 0;
    int data;
    int[][] store = new int[N][2];
    for (int i = 0; i < N; i++) {
      if (A[i] != i + 1) {
        data = A[i];
        A[i] = A[data - 1];
        A[data - 1] = data;
        store[i][0] = i + 1;
        store[i][1] = data;
        count++;
      }
    }
    System.out.println(count);
    for (int i = 0; i < N; i++) {
      System.out.println(A[i] + "\t");
    }
    // @Test
    // void addition() {
    // assertEquals(2, 1 + 1);
    // }
  }
}