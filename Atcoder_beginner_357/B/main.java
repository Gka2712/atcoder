// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
    int M=sc.nextInt();
    int[] H=new int[N];
    for(int i=0;i<N;i++){
      H[i]=sc.nextInt();
    }
    int nokori=M;
    for(int i=0;i<N;i++){
      if(nokori-H[i]>=0){
        nokori=nokori-H[i];
      }
      else{
        System.out.println(i);
        return;
      }
    }
    System.out.println(N);
    
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}