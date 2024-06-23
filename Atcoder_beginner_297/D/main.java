import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        long count = 0;
        if (A < B) {
            Long temp = A;
            A = B;
            B = temp;
        }
        while (B > 0) {
            count += (A / B);
            A %= B;
            Long temp = A;
            A = B;
            B = temp;
        }
        System.out.println(count-1);
    }

}
