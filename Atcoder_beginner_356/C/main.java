import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        int K=sc.nextInt();
        int[] C=new int[M];
        ArrayList<Integer>[] A=new ArrayList[M];
        String[] R=new String[M];
        for(int i=0;i<M;i++){
            C[i]=sc.nextInt();
            A[i]=new ArrayList<Integer>();
            for(int j=0;j<C[i];j++){
                int a=sc.nextInt()-1;
                A[i].add(a);
            }
            R[i]=sc.next();
        }
        sc.close();
        int ans=0;
        for(int mask=0;mask<(1<<N);mask++){
            boolean ok=true;
            for(int i=0;i<M;i++){
                int cnt=0;
                for(int a:A[i]){
                    if(((mask>>a)&1)==1){
                        cnt++;
                    }                    
                }
                ok&=(cnt>=K)==(R[i].equals("○"));
            }
            if(ok){
                ans++;
            }
        }
        System.out.println(ans);
    }
}
