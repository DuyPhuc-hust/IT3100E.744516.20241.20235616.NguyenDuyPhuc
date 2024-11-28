import java.util.Scanner;

public class CalculateTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        double quotient;
        if (num2 != 0){
            quotient = num1 / num2;
        }else {
            quotient = Double.NaN;
        }

        // In ra kết quả
        System.out.println("Sum of 2 number is " + sum);
        System.out.println("Difference of 2 number is " + difference);
        System.out.println("Product of 2 number is " + product);
        if (num2 != 0) {
            System.out.printf("Quotient: %.2f%n", quotient);
        } else {
            System.out.println("Quotient: Undefined (division by zero)");
        }

    }
}
