import java.util.*;
import java.math.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int H = sc.nextInt();
    int P=0;
    int i=0;
    while(H>=P){
      P+=Math.pow(2,i);
      i++;
    }
    System.out.println(i);
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}