// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import java.util.*;
import java.math.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String S=sc.nextLine();
    String T=sc.nextLine();
    if(T.length()==3){
      if(T.charAt(2)=='X'){
        int Sloc=0;
        int Tloc=0;
        while(Sloc<S.length()){
          char Schar=Character.toUpperCase(S.charAt(Sloc));
          if(Schar==T.charAt(Tloc)){
            Tloc++;
          }
          Sloc++;
          if(Tloc>=2){
            System.out.println("Yes");
            return;
          }
        }
      }
      else{
        int Sloc=0;
        int Tloc=0;
        while(Sloc<S.length()){
          char Schar=Character.toUpperCase(S.charAt(Sloc));
          if(Schar==T.charAt(Tloc)){
            Tloc++;            
          }
          Sloc++;
          if(Tloc>=3){
            System.out.println("Yes");
            return;
          }
        }
      }
      System.out.println("No");
    }
  }

  // @Test
  // void addition() {
  // assertEquals(2, 1 + 1);
  // }
}