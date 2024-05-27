import java.util.*;
public class Main{
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      int N=sc.nextInt();
      int L=sc.nextInt();
      int[] A=new int[N];
      for(int i=0;i<N;i++){
        A[i]=sc.nextInt();
      }
      int M=200000;
      int maxnum=1000000000;
      int[] dp=new int[M+1];
      Arrays.fill(dp,maxnum);
      dp[0]=0;
      int k=1;
      while((k*(L-k)<=M)&&(k*2<=L)){
        int w=k*(L-k);
        for(int i=w;i<=M;i++){
          dp[i]=Math.min(dp[i],dp[i-w]+1);
        }
        k++;
      }
      for (int i = 0; i < N; i++) {
          if (dp[A[i]] == maxnum) {
              System.out.println(-1);
          } else {
              System.out.println(dp[A[i]]);
          }
      }

    }
}