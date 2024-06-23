import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int D=sc.nextInt();
        int[] T=new int[N];
        for(int i=0;i<N;i++){
            T[i]=sc.nextInt();
        }
        for(int i=1;i<N;i++){
            if(T[i]-T[i-1]<=D){
                System.out.println(T[i]);
                return;
            }
        }
        System.out.println(-1);
    }

}
