import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int L = sc.nextInt();
    int R = sc.nextInt();
    int[] A = new int[N];
    int Change=R;
    for (int i = 0; i < N; i++){
      if((L<=i+1)&&(i+1<=R)){
        A[i]=Change;
        Change--;
      }else{
        A[i]=i+1;
      }
    }
    for(int i=0;i<N;i++){
      System.out.print(A[i]+" "); 
    }
  }
}