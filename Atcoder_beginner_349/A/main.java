import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N=sc.nextInt();
    int[] A=new int[N];
    int sum=0;
    for(int i=0;i<N-1;i++){
      A[i]=sc.nextInt();
      sum+=A[i];
    }
    sum=sum*(-1);
    System.out.println(sum);
  }
}