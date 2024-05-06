// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int A, B;
    long difmax = 0;
    long result = 0;
    for (int i = 0; i < N; i++) {
      A = sc.nextInt();
      B = sc.nextInt();
      result += A;
      difmax = Math.max(difmax, B-A);

    }
    result += difmax;
    System.out.println(result);

  }
}