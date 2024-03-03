package Matrix;
public class Matrix {
    private final int rows;
    private final int cols;
    private final int[][] data;

    public Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.data = new int[rows][cols];
    }

    public Matrix(int[][] data) {
        this.rows = data.length;
        this.cols = data[0].length;
        this.data = data;
    }

    public int getRows() {
        return rows;
    }

    public int getCols() {
        return cols;
    }

    public int[][] getData() {
        return data;
    }

    public static Matrix multiply(Matrix a, Matrix b) {
        if (a.getCols() != b.getRows()) {
            throw new IllegalArgumentException("Matrices cannot be multiplied, dimensions mismatch");
        }

        int[][] resultData = new int[a.getRows()][b.getCols()];

        for (int i = 0; i < a.getRows(); i++) {
            for (int j = 0; j < b.getCols(); j++) {
                int sum = 0;
                for (int k = 0; k < a.getCols(); k++) {
                    sum += a.getData()[i][k] * b.getData()[k][j];
                }
                resultData[i][j] = sum;
            }
        }

        return new Matrix(resultData);
    }

    public static void printMatrix(Matrix matrix) {
        for (int i = 0; i < matrix.getRows(); i++) {
            for (int j = 0; j < matrix.getCols(); j++) {
                System.out.print(matrix.getData()[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] data1 = {{1, 2, 3}, {4, 5, 6}};
        int[][] data2 = {{7, 8}, {9, 10}, {11, 12}};

        Matrix matrix1 = new Matrix(data1);
        Matrix matrix2 = new Matrix(data2);

        System.out.println("Matrix 1:");
        printMatrix(matrix1);
        System.out.println("Matrix 2:");
        printMatrix(matrix2);

        Matrix result = multiply(matrix1, matrix2);

        System.out.println("Result of multiplication:");
        printMatrix(result);
    }
}
