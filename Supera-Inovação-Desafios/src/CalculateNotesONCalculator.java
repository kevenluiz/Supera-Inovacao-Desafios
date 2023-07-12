import java.util.Scanner;

public class CalculateNotesONCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor que deseja calcular: ");
        float value = scanner.nextFloat();

        int notes100 = (int) (value / 100);
        value %= 100;

        int notes50 = (int) (value / 50);
        value %= 50;

        int notes20 = (int) (value / 20);
        value %= 20;

        int notes10 = (int) (value / 10);
        value %= 10;

        int notes5 = (int) (value / 5);
        value %= 5;

        int notes2 = (int) (value / 2);
        value %= 2;

        int coins1 = (int) value;
        value %= 1;

        int coins50 = (int) (value / 0.5f);
        value %= 0.5f;

        int coins25 = (int) (value / 0.25f);
        value %= 0.25f;

        int coins10 = (int) (value / 0.10f);
        value %= 0.10f;

        int coins5 = (int) (value / 0.05f);
        value %= 0.05f;

        int coins1cent = Math.round(value / 0.01f);

        System.out.println("NOTAS:");
        System.out.printf("%d nota(s) de R$ %.2f%n", notes100, 100.00);
        System.out.printf("%d nota(s) de R$ %.2f%n", notes50, 50.00);
        System.out.printf("%d nota(s) de R$ %.2f%n", notes20, 20.00);
        System.out.printf("%d nota(s) de R$ %.2f%n", notes10, 10.00);
        System.out.printf("%d nota(s) de R$ %.2f%n", notes5, 5.00);
        System.out.printf("%d nota(s) de R$ %.2f%n", notes2, 2.00);

        System.out.println("MOEDAS:");
        System.out.printf("%d moeda(s) de R$ %.2f%n", coins1, 1.00);
        System.out.printf("%d moeda(s) de R$ %.2f%n", coins50, 0.50);
        System.out.printf("%d moeda(s) de R$ %.2f%n", coins25, 0.25);
        System.out.printf("%d moeda(s) de R$ %.2f%n", coins10, 0.10);
        System.out.printf("%d moeda(s) de R$ %.2f%n", coins5, 0.05);
        System.out.printf("%d moeda(s) de R$ %.2f%n", coins1cent, 0.01);
    }
}
