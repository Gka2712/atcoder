// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] human = new int[3];
    Arrays.fill(human, 0);
    int A = sc.nextInt();
    int B = sc.nextInt();
    human[A - 1] = 1;
    human[B - 1] = 1;
    int suspect=0;
    int sussub=-1;
    int j=0;
    for (int i = 0; i < 3; i++) {
      if (human[i] == 0) {
        suspect+=1;
        sussub=i+1;
      }
    }
    if(suspect==1){
      System.out.println(sussub);
    }
    else{
      System.out.println(-1);
    }
    // @Test
    // void addition() {
    // assertEquals(2, 1 + 1);
    // }
  }
}