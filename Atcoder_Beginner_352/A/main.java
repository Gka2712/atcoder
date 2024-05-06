// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] stop = sc.nextLine().split(" ");
    int N = Integer.parseInt(stop[0]);
    int X = Integer.parseInt(stop[1]);
    int Y = Integer.parseInt(stop[2]);
    int Z = Integer.parseInt(stop[3]);
    if (((X <= Z) && (Y >= Z)) || ((X >= Z) && (Y <= Z))) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
    sc.close();
  }

  // @Test
  // void addition() {
  // assertEquals(2, 1 + 1);
  // }
}