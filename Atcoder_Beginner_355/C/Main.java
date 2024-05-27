import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int T = sc.nextInt();
    int[] tate = new int[N];
    int[] yoko = new int[N];
    int[] naname = new int[2];
    for (int i = 0; i < T; i++) {
      int turn = sc.nextInt();
      int tturn = (turn - 1) % N;
      tate[tturn]++;
      if (tate[tturn] == N) {
        System.out.println(i + 1);
        return;
      }
      int yturn = (turn - 1) / N;
      yoko[yturn]++;
      if (yoko[yturn] == N) {
        System.out.println(i + 1);
        return;
      }
      if (tturn == yturn) {
        naname[0]++;
        if (naname[0] == N) {
          System.out.println(i + 1);
          return;
        }
      }
      if (tturn + yturn +1 == N) {
        naname[1]++;
        if (naname[1] == N) {
          System.out.println(i + 1);
          return;
        }
      }
    }
    System.out.println(-1);
  }
}