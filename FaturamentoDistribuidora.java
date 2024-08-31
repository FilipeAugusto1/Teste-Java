import java.util.Arrays;

public class FaturamentoDistribuidora {
    public static void main(String[] args) {
        double[] faturamento = { 2300.50, 2750.00, 3000.75, 3150.20, 2980.00, 2900.90, 3025.40 };

        double menor = Arrays.stream(faturamento).min().orElse(0);
        double maior = Arrays.stream(faturamento).max().orElse(0);
        double media = Arrays.stream(faturamento).average().orElse(0);

        System.out.printf("Menor valor de faturamento: %.2f%n", menor);
        System.out.printf("Maior valor de faturamento: %.2f%n", maior);
        System.out.printf("Média de faturamento: %.2f%n", media);
    }
}
