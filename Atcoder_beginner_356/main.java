import java.util.*;

public class Main {
    static final long MOD = 998244353;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n, m;
        n = sc.nextLong();
        m = sc.nextLong();
        long res = 0;
        for (long i = 0; i < 60; i++) {
            if ((m & 1L << i) > 0) {
                res += f(i, n);
                res %= MOD;
            }
        }
        System.out.println(res);
    }

    static long f(long j, long n) {
        long res = ((n >> (j + 1)) << j);
        if ((n & (1L << j)) > 0) {
            res+=((n&((1L<<j)-1))+1);
        }
        return res;
    }
}