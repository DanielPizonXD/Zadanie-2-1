/*import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Wprowadź tekst: ");
        String tekst = scanner.nextLine();

        String konwertowanyTekst = zamienLitery(tekst);

        System.out.println("Konwertowany tekst: " + konwertowanyTekst);
    }

    public static String zamienLitery(String tekst) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < tekst.length(); i++) {
            char znak = tekst.charAt(i);

            if (Character.isUpperCase(znak)) {
                znak = Character.toLowerCase(znak);
            } else if (Character.isLowerCase(znak)) {
                znak = Character.toUpperCase(znak);
            }

            sb.append(znak);
        }

        return sb.toString();
    }
}
*/

/*import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Wprowadź liczbę całkowitą: ");
        int n = scanner.nextInt();

        long factorial = calculateFactorial(n);

        System.out.println("Silnia z " + n + " wynosi: " + factorial);
    }

    public static long calculateFactorial(int n) {
        if (n < 0) {
            System.out.println("Silnia jest zdefiniowana tylko dla liczb nieujemnych.");
            return -1;
        }

        long result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        return result;
    }
}
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Wprowadź wartości a, b i c dla równania kwadratowego (ax^2 + bx + c): ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double delta = calculateDelta(a, b, c);

        if (delta > 0) {
            double x1 = (-b - Math.sqrt(delta)) / (2 * a);
            double x2 = (-b + Math.sqrt(delta)) / (2 * a);
            System.out.println("Delta wynosi: " + delta);
            System.out.println("Miejsca zerowe: x1 = " + x1 + ", x2 = " + x2);
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("Delta wynosi: " + delta);
            System.out.println("Miejsce zerowe: x = " + x);
        } else {
            System.out.println("Delta jest mniejsza od zera. Brak miejsc zerowych dla podanych wartości a, b i c.");
        }
    }

    public static double calculateDelta(double a, double b, double c) {
        return b * b - 4 * a * c;
    }
}
