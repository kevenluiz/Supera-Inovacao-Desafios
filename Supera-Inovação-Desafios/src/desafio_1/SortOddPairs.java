import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SortOddPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o numero de valores: ");
        int n = scanner.nextInt();

        List<Integer> evens = new ArrayList<>();
        List<Integer> odds = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.print("Digite o valor de número #" + (i + 1) + ": ");
            int value = scanner.nextInt();
            if (value % 2 == 0) {
                evens.add(value);
            } else {
                odds.add(value);
            }
        }

        Collections.sort(evens);
        Collections.sort(odds, Collections.reverseOrder());

        for (int value : evens) {
            System.out.println(value);
        }

        for (int value : odds) {
            System.out.println(value);
        }
    }
}
