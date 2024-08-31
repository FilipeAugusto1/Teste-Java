import java.util.Scanner;

public class InverterString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe uma string: ");
        String original = scanner.nextLine();

        String invertida = new StringBuilder(original).reverse().toString();
        System.out.println("String invertida: " + invertida);

        scanner.close();
    }
}
