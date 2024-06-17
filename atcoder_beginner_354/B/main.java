import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        String[] name=new String[N];
        int[] rating=new int[N];
        int sum=0;
        for(int i=0;i<N;i++){
       name[i]=sc.next();
            rating[i]=sc.nextInt();
            sum+=rating[i];
        }
        Arrays.sort(name);
        int index=sum%N;
        System.out.println(name[index]);
    }
}
