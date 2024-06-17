import java.util.*;

class Card implements Comparable<Card> {
    int a;
    int c;
    int index;

    public Card(int a, int c, int index) {
        this.a = a;
        this.c = c;
        this.index = index;
    }

    // C[i] の昇順にソートするための比較関数
    public int compareTo(Card other) {
        return Integer.compare(this.c, other.c);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 入力
        int n = scanner.nextInt();
        Card[] cards = new Card[n];
        for (int i = 0; i < n; ++i) {
            int a = scanner.nextInt();
            int c = scanner.nextInt();
            cards[i] = new Card(a, c, i);
        }

        // C[i] の昇順にソート
        Arrays.sort(cards);

        // 答えを求める計算
        List<Integer> ans = new ArrayList<>();
        int v = 0;
        for (int i = 0; i < n; ++i) {
            if (cards[i].a > v) {
                v = cards[i].a;
                ans.add(cards[i].index);
            }
        }
        Collections.sort(ans);

        // 出力
        int m = ans.size();
        System.out.println(m);
        for (int i = 0; i < m; ++i) {
            System.out.print(ans.get(i) + 1);
            if (i == m - 1) {
                System.out.println();
            } else {
                System.out.print(" ");
            }
        }
    }
}
