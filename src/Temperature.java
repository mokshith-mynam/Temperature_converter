import java.util.InputMismatchException;
import java.util.Scanner;

public class Temperature {

    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("--- Welcome to Temperature Unit Converter Program ---");

        while(running) {
            try {
                System.out.println("1. Convert into Fahrenheit");
                System.out.println("2. Convert into Celsius");
                System.out.println("3. Exit from converter program");
                System.out.println("Enter your option: ");
                int input = scanner.nextInt();

                if (input == 1) {
                    System.out.println("Enter temperature in Celsius: ");
                    int celsius = scanner.nextInt();
                    float temperatureFahrenheit = convertCelsiusToFahrenheit(celsius);
                    System.out.println("Temperature in Fahrenheit = " + temperatureFahrenheit);
                    System.out.println("----------------------------------------------------------");
                } else if (input == 2) {
                    System.out.println("Enter temperature in Fahrenheit: ");
                    float fahrenheit = scanner.nextFloat();
                    float temperatureCelsius = convertFahrenheitToCelsius(fahrenheit);
                    System.out.printf("Temperature in Celsius = %.1f%n", temperatureCelsius);
                    System.out.println("----------------------------------------------------------");
                } else if (input == 3) {
                    System.out.println("Exiting the program. GoodBye!");
                    running = false;
                } else {
                    System.out.println("Invalid option selected. Select the option between 1, 2, and 3.");
                    System.out.println(" ");
                    System.out.println("----------------------------------------------------------");
                }
            } catch(InputMismatchException e) {
                System.out.println("Input mismatch! A valid number is required.");
                scanner.nextLine();
                System.out.println("--------------------------------------------------------------");
            }
        }
        scanner.close();
    }

    static float convertCelsiusToFahrenheit(int celsius) {
        return celsius * 1.8F + 32;
    }

    static float convertFahrenheitToCelsius(float fahrenheit) {
        return (fahrenheit - 32)/1.8F;
    }

}