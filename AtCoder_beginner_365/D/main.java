import java.util.Scanner;

public class Main {
    static final int maxN = 1001000, mN = 1000000;
    static int n;
    static long[][] dp = new long[mN][4];
    static String s;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        s = sc.next();

        for (int i = 1; i <= n; i++) {
            if (s.charAt(i - 1) == 'R') {
                dp[i][1] = Math.max(dp[i - 1][0], dp[i - 1][2]) + 1;
                dp[i][0] = Math.max(dp[i - 1][1], dp[i - 1][2]);
            }
            if (s.charAt(i - 1) == 'P') {
                dp[i][1] = Math.max(dp[i - 1][0], dp[i - 1][2]);
                dp[i][2] = Math.max(dp[i - 1][0], dp[i - 1][1]) + 1;
            }
            if (s.charAt(i - 1) == 'S') {
                dp[i][2] = Math.max(dp[i - 1][0], dp[i - 1][1]);
                dp[i][0] = Math.max(dp[i - 1][1], dp[i - 1][2]) + 1;
            }
        }

        System.out.println(Math.max(Math.max(dp[n][0], dp[n][1]), dp[n][2]));
        sc.close();
    }
}
