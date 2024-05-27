// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import java.util.*;
public class Main {
  public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
    String[] Ns=sc.nextLine().split(" ");
    int N=Integer.parseInt(Ns[0]);
    int Q=Integer.parseInt(Ns[1]);
    int removtoth=0;
    int[] tooth=new int[N];
    Arrays.fill(tooth,0);
    for(int i=0;i<Q;i++){
      int T=sc.nextInt();
      if(tooth[T-1]==0){
        tooth[T-1]=1;
        removtoth++;        
      }
      else{
        tooth[T-1]=0;
        removtoth--;
      }
    }
    System.out.println(N-removtoth);
  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
  }
}