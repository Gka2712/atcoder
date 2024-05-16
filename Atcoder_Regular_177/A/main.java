// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] a = new int[6];
    for (int i = 0; i < 6; i++) {
      a[i] = sc.nextInt();
    }
    int[] sum = { 1, 5, 10, 50, 100, 500 };
    int N = sc.nextInt();
    int[] X = new int[N];
    for (int i = 0; i < N; i++) {
      X[i] = sc.nextInt();
    }
    for (int i = 0; i < N; i++) {
      int coin=5;
      while (X[i] > 0) {
        if (a[coin] <= 0) {
          coin--;
        } else if (X[i] < sum[coin]) {
          coin--;
        } else {
          X[i] -= sum[coin];
          a[coin]--;
        }
        if (coin < 0) {
          System.out.println("No");
          return;
        }
      }
    }
    System.out.println("Yes");
  }

  // @Test
  // void addition() {
  // assertEquals(2, 1 + 1);
  // }
}