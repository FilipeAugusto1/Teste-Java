import java.util.Scanner;

public class FibonacciChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um número: ");
        int num = scanner.nextInt();

        if (isFibonacci(num)) {
            System.out.println(num + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(num + " não pertence à sequência de Fibonacci.");
        }

        // Fechando o scanner para evitar o "resource leak"
        scanner.close();
    }

    public static boolean isFibonacci(int n) {
        int a = 0, b = 1;
        if (n == a || n == b) return true;
        int c = a + b;
        while (c <= n) {
            if (c == n) return true;
            a = b;
            b = c;
            c = a + b;
        }
        return false;
    }
}
