import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if (year % 4 != 0) {
            System.out.println("365");
        } else if (year % 100 != 0) {
            System.out.println("366");
        } else if (year % 400 != 0) {
            System.out.println("365");
        } else {
            System.out.println("366");
        }
    }
}
