import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        String[] name=new String[N];
        int count=0;
        for(int i=0;i<N;i++){
            name[i]=sc.next();
            if(name[i].equals("Takahashi")){
                count++;
            }
        }
        System.out.println(count);
    }

}
