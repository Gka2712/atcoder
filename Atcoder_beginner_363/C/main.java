import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        String S = sc.next();
        List<Integer> all = new ArrayList<Integer>();
        for (int i = 0; i < N; i++) {
            all.add((int) (S.charAt(i) - 'a'));
        }
        Collections.sort(all);
        int ans = 0;
        boolean ok, flag;
        while (true) {
            ok = true;
            for (int i = 0; i <= N - K; i++) {
                flag = true;
                for (int j = 0; j < K; j++) {
                    if (!all.get(i + j).equals(all.get(i + K - 1 - j))) {
                        flag = false;
                        break;
                    }
                }
                if (flag)
                    ok = false;
            }
            if (ok)
                ans++;
            if (!nextPermulation(all))
                break;
        }
        System.out.println(ans);
    }

    private static boolean nextPermulation(List<Integer> a) {
        int n = a.size();
        int i = n - 2;
        while (i >= 0 && a.get(i) >= a.get(i + 1)) {
            i--;
        }
        if (i < 0)
            return false;
        int j = n - 1;
        while (j >= 0 && a.get(i) >= a.get(j)) {
            j--;
        }
        Collections.swap(a, i, j);
        Collections.reverse(a.subList(i + 1, n));
        return true;
    }
}
