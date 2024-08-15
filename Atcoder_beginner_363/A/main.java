import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R=sc.nextInt();
        int N=0;
        if(R<100){
            N=100-R;
        }
        else if(R<200){
            N=200-R;
        }
        else if(R<300){
            N=300-R;
        }
        else{
            N=400-R;
        }
        System.out.println(N);
    }

}
