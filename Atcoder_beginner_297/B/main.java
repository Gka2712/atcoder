import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S=sc.next();
        int B1=-1;
        int B2=-1;
        int R1=-1;
        int R2=-1;
        int K=-1;
        for(int i=0;i<8;i++){
            if(S.charAt(i)=='B'){
                if(B1<0){
                    B1=i;
                }
                else if(B2<0){
                    B2=i;
                }
            }
            else if(S.charAt(i)=='R'){
                if(R1<0){
                    R1=i;
                }
                else if(R2<0){
                    R2=i;
                }
            }
            else if(S.charAt(i)=='K'){
                K=i;
            }
        }
        if((B2-B1)%2==0){
            System.out.println("No");
        }
        else if(R1<K&&K<R2){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }

}
