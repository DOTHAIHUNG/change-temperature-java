import java.util.Scanner;

public class changeTemperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double celsius, fahrenheit;
        int choice = -1;

        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter fahrenheit:");
                    fahrenheit = sc.nextDouble();
                    System.out.println("Celsius = " + fahrenheitToCelsius(fahrenheit));
                    break;
                case 2:
                    System.out.println("Enter celsius:");
                    celsius = sc.nextDouble();
                    System.out.println("Fahrenheit = " + celsiusToFahrenheit(celsius));
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }


}
