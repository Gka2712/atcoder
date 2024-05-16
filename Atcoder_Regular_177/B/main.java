// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String S = sc.next();
    int success = 0;
    int startnum = -1;
    String result = "";
    if (N == S.length()) {

      for (int i = N - 1; i >= 0; i--) {
        if (S.charAt(i) == '1') {
          success++;
          if (success == 1) {
            startnum = i;

            for (int j = 0; j < i + 1; j++) {
              result += 'A';
            }
          }
        } else {
          for (int j = 0; j < (startnum - success + 1); j++) {
            result += 'B';
          }
          success = 0;
          startnum = -1;
        }
      }
      System.out.println(result.length());
      System.out.println(result);
    } else {
      return;
    }
  }

  // @Test
  // void addition() {
  // assertEquals(2, 1 + 1);
  // }
}