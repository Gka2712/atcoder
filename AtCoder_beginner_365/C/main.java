import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 入力の読み取り
        int N = sc.nextInt();
        long M = sc.nextLong();
        long[] A = new long[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextLong();
        }
        
        // 最大の補助額の上限を二分探索で求める
        long result = maxSubsidyLimit(N, M, A);
        
        // 結果の出力
        if (result == Long.MAX_VALUE) {
            System.out.println("infinite");
        } else {
            System.out.println(result);
        }
    }
    
    private static long maxSubsidyLimit(int N, long M, long[] A) {
        long low = 0;
        long high = Arrays.stream(A).max().orElse(0L);
        long result = 0;

        while (low <= high) {
            long mid = (low + high) / 2;
            if (isWithinBudget(mid, N, M, A)) {
                result = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (isWithinBudget(high + 1, N, M, A)) {
            return Long.MAX_VALUE;
        } else {
            return result;
        }
    }

    private static boolean isWithinBudget(long x, int N, long M, long[] A) {
        long total = 0;
        for (int i = 0; i < N; i++) {
            total += Math.min(x, A[i]);
            if (total > M) {
                return false;
            }
        }
        return total <= M;
    }
}
