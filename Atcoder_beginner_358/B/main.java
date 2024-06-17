// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N=sc.nextInt();
    int A=sc.nextInt();
    int[] T=new int[N+1];
    int[] S=new int[N*2];
    T[0]=0;
    for(int i=1;i<N+1;i++){
      T[i]=sc.nextInt();
    }
    S[0]=0;
    for(int i=1;i<N+1;i++){
      S[i]=Math.max(S[i-1]+A,T[i]+A);
    }
    for(int i=1;i<N+1;i++){
      System.out.println(S[i]);
    }
  }

  // @Test
  // void addition() {
  // assertEquals(2, 1 + 1);
  // }
}