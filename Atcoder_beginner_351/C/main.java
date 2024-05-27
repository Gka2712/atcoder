import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<Integer>();
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            int a = sc.nextInt();
            stack.push(a);
            while (stack.size() > 1) {
                int num1 = stack.pop();
                int num2 = stack.pop();
                if (num1 == num2) {
                    stack.push(num1 + 1);
                } else {
                    stack.push(num2);
                    stack.push(num1);
                    break;
                }
            }
        }
        System.out.println(stack.size());
    }
}
