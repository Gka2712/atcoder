import java.util.Scanner;

public class Main {public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
    char[] S=new char[N];
    int pass1=0;
    int pass2=0;
    S=sc.next().toCharArray();
    for(int i=0;i<N;i++){
        if(S[i]=='o'){
            pass1++;
        }
        if(S[i]=='x'){
            pass2++;
        }
    }
    if(pass1>0&&pass2==0){
        System.out.println("Yes");
    }
    else{
        System.out.println("No");
    }
    
}

}