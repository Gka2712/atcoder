// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String[][] A = new String[N][N];
    String[][] B = new String[N][N];
    int arnum=0;
    for (int i = 0; i < N; i++) {
      A[i] = sc.next().split("");
    }
    for (int i = 0; i < N; i++) {
      B[i] = sc.next().split("");
    }
    for (int i = 0; i < N; i++) {
      if (!Arrays.equals(A[i],B[i])) {
        arnum=i;
        break;
      }
    }
    for(int i=0;i<N;i++)
      {
        if(!A[arnum][i].equals(B[arnum][i]))
        {
          System.out.println((arnum+1)+" "+(i+1));
          break;
        }
      }
  }
}