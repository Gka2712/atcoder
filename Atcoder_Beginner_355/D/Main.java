import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] left = new int[N];
        int[] right = new int[N];

        for (int i = 0; i < N; i++) {
            left[i] = sc.nextInt();
            right[i] = sc.nextInt();
        }

        Arrays.sort(left);
        Arrays.sort(right);
        long ans = (long) N * (N - 1) / 2;
        int j = 0;

        for (int i = 0; i < N; i++) {
            while (right[j] < left[i]) { // 境界条件を追加
                j++;
            }
            ans -= j;
        }

        System.out.println(ans);
    }
}
