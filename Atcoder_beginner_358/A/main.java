// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    String T = sc.next();
    if (S.equals("AtCoder") && (T.equals("Land"))) {
      System.out.println("Yes");
      return;
    } else {
      System.out.println("No");
      return;
    }
  }

  // @Test
  // void addition() {
  // assertEquals(2, 1 + 1);
  // }
}