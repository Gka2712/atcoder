import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] A = new int[num];
        for (int i = 0; i < num; i++) {
            A[i] = sc.nextInt();
        }
        int[] B = A.clone();
        Arrays.sort(A);
        for (int i = 0; i < num; i++) {
            if (A[num - 2] == B[i]) {
                System.out.println(i + 1);
            }
        }

    }
}
