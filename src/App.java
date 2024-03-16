import java.util.InputMismatchException;
import java.util.Scanner;

class Calculator {
    float result = 0;
    public float Addition(float num1, float num2) {
        // This is the extension of the calculator class for Addition
        result = num1 + num2;
        return result;
    }
    public float Subtraction(float num1, float num2) {
        // This is the extension of the calculator class for Subtraction
        result = num1 - num2;
        return result;
    }
    public float Multiplication(float num1, float num2) {
        // This is the extension of the calculator class for Multiplication
        result = num1 * num2;
        return result;
    }
    public float Devision(float num1, float num2) {
        // This is the extension of the calculator class for Devision
        try {
            if (num2 != 0) {
                result = num1 / num2;
            } else {
                System.out.println("Dividend cannot be 0. Please try again.");
                return Float.NaN;
            }
        } catch (ArithmeticException e) {
            System.out.println("An arithmetic error occured: " + e.getMessage());
        }
        return result;
    }
}

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calc = new Calculator();
        float num1, num2, result;
        int userChoice;

        System.out.println("\nWelcome, what would you like to do?\n");
        while (true) {
            try {
                while (true) {
                    System.out.println("1. Add\n2. Subtract\n3. Multiply\n4. Divide\n0. Exit\nPlease select an option: ");

                    userChoice = scanner.nextInt();
                    switch (userChoice) {
                        case 1:
                            System.out.println("Value of first Number:");
                            num1 = scanner.nextFloat();
                            System.out.println("Value of second Number:");
                            num2 = scanner.nextFloat();
                            result = calc.Addition(num1, num2);
        
                            System.out.println("Result = " + result);
                            break;
                        case 2:
                            System.out.println("Value of first Number:");
                            num1 = scanner.nextFloat();
                            System.out.println("Value of second Number:");
                            num2 = scanner.nextFloat();
                            result = calc.Subtraction(num1, num2);
        
                            System.out.println("Result = " + result);
                            break;
                        case 3:
                            System.out.println("Value of first Number:");
                            num1 = scanner.nextFloat();
                            System.out.println("Value of second Number:");
                            num2 = scanner.nextFloat();
                            result = calc.Multiplication(num1, num2);
        
                            System.out.println("Result = " + result);
                            break;
                        case 4:
                            System.out.println("Value of first Number:");
                            num1 = scanner.nextFloat();
                            System.out.println("Value of second Number:");
                            num2 = scanner.nextFloat();
                            result = calc.Devision(num1, num2);
        
                            System.out.println("Result = " + result);
                            break;
                        case 0:
                            System.out.println("Goodbye!");
                            scanner.close();
                            System.exit(userChoice);
                        default:
                            System.out.println("\nInvalid option. please try again.\n");
                            break;
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please try again.");

                scanner.next();
            }
        }
    }
}
