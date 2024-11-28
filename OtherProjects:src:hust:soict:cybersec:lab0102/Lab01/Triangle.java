import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the height of the triangle: ");
        String input = scanner.nextLine();
        int n = Integer.parseInt(input.trim());
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            for (int i = 1; i <= n; i++) {
                for (int j = 0; j < n - i; j++) {
                    System.out.print(" ");
                }
                for (int k = 0; k < 2 * i - 1; k++) {
                    System.out.print("*");
                    }
                    System.out.println();
                }
        scanner.close();
    }
}
}

  