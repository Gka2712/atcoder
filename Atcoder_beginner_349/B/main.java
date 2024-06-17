import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    int[] alpha = new int[26];
    for (int i = 0; i < S.length(); i++) {
      alpha[S.charAt(i) - 'a']++;
    }
    int[] frequency = new int[110];
    Arrays.fill(frequency, 0);
    for (int i = 0; i < alpha.length; i++) {
      frequency[alpha[i]]++;
    }
    for (int i = 1; i < frequency.length; i++) {
      if ((frequency[i] != 0) && (frequency[i] != 2)) {
        System.out.println("No");
        return;
      }
    }
    System.out.println("Yes");
  }
}