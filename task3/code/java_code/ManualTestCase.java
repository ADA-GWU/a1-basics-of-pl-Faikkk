package task3.code.java_code;


public class ManualTestCase {
    private int[][] matrix1;
    private int[][] matrix2;
    private int[][] expected;

    public ManualTestCase(int[][] matrix1, int[][] matrix2, int[][] expected) {
        this.matrix1 = matrix1;
        this.matrix2 = matrix2;
        this.expected = expected;
    }

    public int[][] getMatrix1() {
        return matrix1;
    }

    public void setMatrix1(int[][] matrix1) {
        this.matrix1 = matrix1;
    }

    public int[][] getMatrix2() {
        return matrix2;
    }

    public void setMatrix2(int[][] matrix2) {
        this.matrix2 = matrix2;
    }

    public int[][] getExpected() {
        return expected;
    }

    public void setExpected(int[][] expected) {
        this.expected = expected;
    }
}
