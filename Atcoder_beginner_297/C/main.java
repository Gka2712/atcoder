import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H=sc.nextInt();
        int W=sc.nextInt();
        char[][] S=new char[H][W];
        for(int i=0;i<H;i++){
            S[i]=sc.next().toCharArray();
        }
        for(int i=0;i<H;i++){
            for(int j=0;j<W-1;j++){
                if(S[i][j]==S[i][j+1]&&S[i][j]=='T'){
                    S[i][j]='P';
                    S[i][j+1]='C';
                }
            }
        }
        for(int i=0;i<H;i++){
            for(int j=0;j<W;j++){
                System.out.print(S[i][j]);
            }
            System.out.println();
        }
    }

}
