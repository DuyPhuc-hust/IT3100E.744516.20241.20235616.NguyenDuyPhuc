import java.util.Arrays;
import java.util.Scanner;

public class SortSumAvg {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        double[] array = new double[size];
        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextDouble();
        }
        Arrays.sort(array);
        //sum 
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        //average
        double average = sum / size;

        System.out.println("Sorted array: " + Arrays.toString(array));
        System.out.println("Sum of array: " + sum);
        System.out.println("Average value of array: " + average);
        scanner.close();
    }
}
