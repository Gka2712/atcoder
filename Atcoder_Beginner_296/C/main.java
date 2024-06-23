// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N=sc.nextInt();
    int X=sc.nextInt();
    int[] A=new int[N];
    Set<Integer> set=new HashSet<Integer>();
    for(int i=0;i<N;i++){
      A[i]=sc.nextInt();
      set.add(A[i]);
    }
    for(int i=0;i<N;i++){
      if(set.contains(A[i]-X)){
        System.out.println("Yes");
        return;
      }
    }
    System.out.println("No");
    // @Test
    // void addition() {
    // assertEquals(2, 1 + 1);
  }
}
