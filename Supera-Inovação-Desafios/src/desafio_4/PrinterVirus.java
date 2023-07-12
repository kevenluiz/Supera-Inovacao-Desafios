import java.util.Scanner;

public class PrinterVirus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < N; i++) {
            String line = scanner.nextLine();

            int left = line.length() / 2 - 1;
            int right = line.length() - 1;

            StringBuilder result = new StringBuilder();

            while (left >= 0 && right >= line.length() / 2) {
                result.append(line.charAt(left--));
                result.append(line.charAt(right--));
            }

            if (line.length() % 2 != 0) {
                result.append(line.charAt(line.length() / 2));
            }

            System.out.println(result.toString());
        }
    }
}


