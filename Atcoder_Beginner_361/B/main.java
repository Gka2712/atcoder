import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] A=new int[6];
        int[] B=new int[6];
        for(int i=0;i<6;i++){
            A[i]=sc.nextInt();
        }
        for(int i=0;i<6;i++){
            B[i]=sc.nextInt();
        }
        if(A[0]<B[3]&&B[0]<A[3]&&A[1]<B[4]&&B[1]<A[4]&&A[2]<B[5]&&B[2]<A[5]){
            System.out.print("Yes");
        }
        else{
            System.out.print("No");
        }
    }
}