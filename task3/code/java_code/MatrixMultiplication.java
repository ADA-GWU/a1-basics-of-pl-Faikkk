package task3.code.java_code;
import java.util.Scanner;

public class MatrixMultiplication {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {


        System.out.println("""
                Welcome! You will be prompted to enter the dimensions for each of the matrices.
                Then, for each matrix, enter the values. All of the inputs to be one line at a time, with a space in-between.
                """);

        String[] matrixSize1 = sc.nextLine().split(" ");
        int row1 = Integer.parseInt(matrixSize1[0]);
        int col1 = Integer.parseInt(matrixSize1[1]);


        String[] matrixSize2 = sc.nextLine().split(" ");
        int row2 = Integer.parseInt(matrixSize2[0]);
        int col2 = Integer.parseInt(matrixSize2[1]);


        int[][] matrix1 = readMatrix(row1, col1);

        System.out.println("Now, do the same for the second matrix.");
        int[][] matrix2 = readMatrix(row2, col2);

        long start = System.currentTimeMillis();

        int[][] resultant = multiplyMatrices(matrix1, matrix2);

        System.out.println(" ");
        
        for (int i = 0; i < resultant.length; i++) {
            for (int j = 0; j < resultant[0].length; j++) {
                System.out.print(resultant[i][j] + " ");
            }
            System.out.println(" ");
        }
        long finish = System.currentTimeMillis();
        System.out.printf("Time elapsed %d milliseconds", (finish - start));

    }

    public static int[][] readMatrix(int row, int col) {

        int[][] matrix = new int[row][col];
        System.out.println("Enter the rows of the matrix according to the sizes you specified, one row at a time.");

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        sc.nextLine(); // to clear the leftover "\n"
        return matrix;
    }

    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        if (matrix1.length == 0 || matrix2.length == 0){
            return null;
        }

        int rows1 = matrix1.length;
        int cols1 = matrix1[0].length;
        int rows2 = matrix2.length;
        int cols2 = matrix2[0].length;

        // matrix multiplication should not be possible here
        if (cols1 != rows2) {
            return null;
        }

        int[][] resultant = new int[rows1][cols2];

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < rows2; k++) {
                    resultant[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return resultant;
    }
}