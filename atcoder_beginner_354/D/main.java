import java.util.Scanner;
import java.text.DecimalFormat;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double[][] part = { { 1, 0.5, 0, 0.5 }, { 0.5, 1.0, 0.5, 0 } };
    long a = sc.nextLong();
    long b = sc.nextLong();
    long c = sc.nextLong();
    long d = sc.nextLong();

    long yoko4 = (c - a) / 4;
    long yokoexc = (c - a) % 4;
    double area = yoko4 * 2 * (d - b);
    DecimalFormat df = new DecimalFormat("#");
    int[] subsc = new int[(int) yokoexc];
    for (int i = 0; i < yokoexc; i++) {
      subsc[i] = (int) ((a + (yoko4 * 4) + i) % 4);
      if (subsc[i] < 0) {
        subsc[i] = subsc[i] + 4;
      }
    }

    double sum1 = 0, sum2 = 0;
    double sum;
    for (int i = 0; i < yokoexc; i++) {
      sum1 += part[0][subsc[i]];
      sum2 += part[1][subsc[i]];
    }

    if ((d - b) % 2 == 0) {
      sum = ((sum1 + sum2) * (d - b)) / 2;
    } else if (b % 2 == 0) {
      sum = (sum1 * ((double) ((d - b) / 2) + 1)) + (sum2 * (double) ((d - b) / 2));
    } else if (b % 2 == 1) {
      sum = (sum2 * ((double) ((d - b) / 2) + 1)) + (sum1 * (double) ((d - b) / 2));
    } else {
      sum = 0;
    }

    area += sum;
    System.out.println(df.format(area * 2));
  }
}
