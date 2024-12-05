import java.util.Scanner;
public class MatrixAddition {

	public static void main(String[] args) {
		int rows, columns;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of rows: ");
		rows = input.nextInt();
		System.out.println("Enter number of columns: ");
		columns = input.nextInt();
		int A[][] = new int[rows][columns];
		int B[][] = new int[rows][columns];
		int SumMatrix[][] = new int[rows][columns];
		System.out.println("Enter the elements of matrix A: ");
		for (int i=0; i < rows; i++ ) {
			for (int j=0; j < columns; j++ ) {
				A[i][j] = input.nextInt();
			}
		}
		System.out.println("Enter the elements of matrix B: ");
		for (int i=0; i < rows; i++ ) {
			for (int j=0; j < columns; j++ ) {
				B[i][j] = input.nextInt();
			}
		}
		System.out.println("Sum of matrix A and B is: ");
		for (int i=0; i < rows; i++ ) {
			for (int j=0; j < columns; j++ ) {
				SumMatrix[i][j] = A[i][j] + B[i][j];
			}
		}
		for (int i=0; i < rows; i++ ) {
			for (int j=0; j < columns; j++ ) {
				System.out.print(SumMatrix[i][j] + "\t");
			}
			System.out.print("\n");
		}

	}

}
