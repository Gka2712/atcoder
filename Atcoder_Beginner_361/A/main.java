import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int K=sc.nextInt();
        int X=sc.nextInt();
        int[] A=new int[N];
        for(int i=0;i<N;i++){
            A[i]=sc.nextInt();
        }
        for(int i=0;i<N;i++){
            System.out.print(A[i]+" ");
            if(i+1==K){
                System.out.print(X+" ");
            }
        }
    }
}
