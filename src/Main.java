import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.println("Podaj dwie liczby :" );

        System.out.println("Liczba pierwsza:" );
        double pierwsza = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Liczba druga" );
        double druga = scanner.nextDouble();
        scanner.nextLine();

        calculator.obliczenia(pierwsza,druga);

        scanner.close();
    }
}
