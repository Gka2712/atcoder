// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import java.util.*;

public class Main {
  static int[][] carpet = new int[800][800];

  static void carpetman(int nx, int mx, int ny, int my) {
    int xdis = mx - nx;
    int ydis = my - ny;
    if ((nx >= mx) && (ny >= my)) {
      return;
    }
    for (int i = nx; i < mx; i++) {
      for (int j = ny; j < my; j++) {
        carpet[i][j] = 1;
      }
    }
    nx = nx / 3;
    ny = ny / 3;
    mx = mx / 3;
    my = my / 3;
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        if (i == 1 && j == 1) {
          continue;
        }
        carpetman(nx + (i * xdis), mx + (i * xdis), ny + (j * ydis), my + (j * ydis));
      }
    }

  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char[][] carpetc = new char[800][800];
    int N = sc.nextInt();
    int mininum = ((int) Math.pow(3, N) / 3);
    int maxnum = ((int) Math.pow(3, N) / 3) * 2;
    carpetman(mininum, maxnum, mininum, maxnum);
    for (int i = 0; i < Math.pow(3, N); i++) {
      for (int j = 0; j < Math.pow(3, N); j++) {
        if (carpet[i][j] == 0) {
          System.out.print("# ");
        } else {
          System.out.print(". ");
        }
      }
      System.out.print("\n");
    }
    // @Test
    // void addition() {
    // assertEquals(2, 1 + 1);
    // }
  }
}