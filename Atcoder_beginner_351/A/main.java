// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] str1 = br.readLine().split(" ");
    String[] str2 = br.readLine().split(" ");
    int str1_sum = 0;
    int str2_sum = 0;
    for (int i = 0; i < str1.length; i++) {
      str1_sum += Integer.parseInt(str1[i]);
    }
    for (int i = 0; i < str2.length; i++) {
      str2_sum += Integer.parseInt(str2[i]);
    }
    int score = str1_sum - str2_sum + 1;
    System.out.println(score);
  }

  // @Test
  // void addition() {
  // assertEquals(2, 1 + 1);
  // }
}