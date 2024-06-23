import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long Sx = sc.nextLong();
        long Sy = sc.nextLong();
        long Tx = sc.nextLong();
        long Ty =sc.nextLong();
        Sx -= (Math.abs(Sy - Sx)) % 2;
        Tx -= (Math.abs(Ty - Tx)) % 2;
        Tx -= Sx;
        Ty -= Sy;
        Tx = Math.abs(Tx);
        Ty = Math.abs(Ty);
        System.out.println(Ty + Math.max(0, Tx - Ty) / 2);

    }

}
