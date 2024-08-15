import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long K = 1;
        long D = 0;
        while (true) {
            N -= K;
            D++;
            if (D % 2 == 1) {
                K = K * 10;
            }
            if (D > 1) {
                N += K / 10;
            }
            if (N < K) {
                break;
            }
        }
        System.out.print(N);
        if (D % 2 == 1) {
            N /= 10;
        }
        while (N > 0) {
            System.out.print(N % 10);
            N /= 10;
        }
    }
}