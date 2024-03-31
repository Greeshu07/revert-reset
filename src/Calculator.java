import java.util.Scanner;

public class Calculator {
    // Method to calculate the sum of two integers
    public static int sum(int a, int b) {
        return a + b;
    }
    public static int subtract(int a, int b) {
        return a - b;
    }
    public static int multiply(int a, int b) {
        return a * b;
    }
    public static double divide(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Division by zero!");
            return Double.NaN; // Not a Number
        }
        return (double) a / b;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();
        System.out.println("Sum: " + sum(num1, num2));
        System.out.println("Difference: " + subtract(num1, num2));
        System.out.println("Product: " + multiply(num1, num2));
        System.out.println("Division: " + divide(num1, num2));
        scanner.close();
    }
}
