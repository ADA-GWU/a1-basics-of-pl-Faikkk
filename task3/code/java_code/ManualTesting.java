package task3.code.java_code;
import java.util.Arrays;

public class ManualTesting {
    public static void main(String[] args) {

        // TEST CASE #1

        // multiplication of matrices of sizes MxN and NxP, respectively;
        // should give a final matrix of MxP
        ManualTestCase testCase1 = new ManualTestCase(
                new int[][]{ {1, 2, 3}, {4, 5, 6} },
                new int[][]{ {2, 5, 4, 5}, {5, 4, 3, 2}, {1, 2, 3, 4} },
                new int[][]{ {15, 19, 19, 21}, {39, 52, 49, 54} }
        );
        int[][] actual1 = MatrixMultiplication.multiplyMatrices(testCase1.getMatrix1(), testCase1.getMatrix2());
        assertTestResult(actual1, testCase1.getExpected(), "Matrix Multiplication with correct dimensions test");

        // TEST CASE #2
        ManualTestCase testCase2 = new ManualTestCase(
                new int[][]{ {1, 2, 3}, {4, 5, 6} },
                new int[][]{ {2, 5, 4, 5}, {5, 4, 3, 2} },
                null
        );
        int[][] actual2 = MatrixMultiplication.multiplyMatrices(testCase2.getMatrix1(), testCase2.getMatrix2());
        assertTestResult(actual2, testCase2.getExpected(), "Matrix multiplication with incorrect dimensions test");


        // TEST CASE #3
        ManualTestCase testCase3 = new ManualTestCase(
                new int[][]{ },
                new int[][]{ {2, 5, 4, 5}, {5, 4, 3, 2} },
                null
        );
        int[][] actual3 = MatrixMultiplication.multiplyMatrices(testCase3.getMatrix1(), testCase3.getMatrix2());
        assertTestResult(actual3, testCase3.getExpected(), "Matrix multiplication with one empty matrix test");
    }

    public static void assertTestResult(int[][] actual, int[][] expected, String testName){
        if (Arrays.deepEquals(actual,expected)){
            System.out.println(testName + " passed!");
        }
        else{
            System.out.println(testName + " failed: expected " + Arrays.deepToString(expected) + ", actual " + Arrays.deepToString(actual));
        }
        System.out.println(" ");
    }
}
