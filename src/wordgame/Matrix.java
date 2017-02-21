package wordgame;

import java.util.Random;

public class Matrix {

    private char[][] charMatrix;
    private int rows;
    private int cols;
    private Random random;
    private static final byte ALPHABET_COUNT_BOUND = 26;

    public Matrix(int rows, int cols) {
        random = new Random();
        setMatrixDimensions(rows, cols);
        matrixInit();
    }

    private void setMatrixDimensions(int rows, int cols) {
        if (rows == 0 && cols == 0) {
            try {
                throw new Exception("Invalid matrix dimension");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (rows > 0 || cols > 0) {
            this.rows = rows;
            this.cols = cols;
        } else {
            this.rows = Math.abs(rows);
            this.cols = Math.abs(cols);
        }
    }

    public char[][] getCharMatrix() {
        return charMatrix;
    }

    public int getRows() {
        return rows;
    }

    public int getCols() {
        return cols;
    }

    private void matrixInit() {
        charMatrix = new char[rows][cols];
        for (int i = 0; i < charMatrix.length; i++) {
            for (int j = 0; j < charMatrix[i].length; j++) {
                charMatrix[i][j] = (char) (random.nextInt(ALPHABET_COUNT_BOUND) + 'a');
            }
        }
    }

    public void printMatrix() {
        for (int i = 0; i < charMatrix.length; i++) {
            for (int j = 0; j < charMatrix[i].length; j++) {
                System.out.print(charMatrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

}
