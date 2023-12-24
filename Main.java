import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        double number = scanner.nextDouble();
        int number1 = (int)number;
        double number2 = number - number1;
        System.out.println((number2));

    }
}
