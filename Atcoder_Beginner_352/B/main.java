// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.nextLine();
    String T = sc.nextLine();
    int Slocal = 0;
    int Tlocal = 0;
    while (Slocal < S.length()) {
      if (S.charAt(Slocal) == T.charAt(Tlocal)) {
        Slocal++;
        System.out.print((Tlocal+1)+" ");
      }
      Tlocal++;
    }
    sc.close();
  }

  // @Test
  // void addition() {
  // assertEquals(2, 1 + 1);
  // }
}