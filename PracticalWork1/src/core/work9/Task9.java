package core.work9;

import java.util.Arrays;

public class Task9 {

    public static void permutationRowsAndColumnsMatrix(int[][] matrix, int row, int column) {

        int minElementInMatrix = getMinElementInMatrix(matrix);
        int positionx = -1;
        int positiony = -1;
        int line = 0;

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] == minElementInMatrix) {
                    positiony = i;
                    positionx = j;
                    break;
                }
            }
        }

        System.out.println("positionx " + positionx);
        System.out.println("positiony " + positiony);
        int[] ints = Arrays.copyOf(matrix[positiony], matrix.length);
        for (int i :
                ints) {
            System.out.println(i);
        }
    }

    public static int[][] createMatrix(int size) {

        int[][] matrix = new int[size][size];
        int row = 0;
        while (row != size) {
            for (int i = 0; i < size; i++) {
                int random = (int) (Math.random() * 100);
                matrix[row][i] = random;
            }
            row++;
        }
        return matrix;
    }

    public static void printMatrix(int[][] matrix) {

        int row = 0;
        while (row != matrix.length) {
            for (int i = 0; i < matrix.length; i++) {
                System.out.printf("%4d", matrix[row][i] );
            }
            System.out.println();
            row++;
        }
    }

    public static int getMinElementInMatrix(int[][] matrix) {

        int minElement = matrix[0][0];
        int row = 0;
        while (row != matrix.length) {
            for (int i = 0; i < matrix.length; i++) {
                if (matrix[row][i] < minElement) {
                    minElement = matrix[row][i];
                }
            }
            row++;
        }
        //      System.out.println(minElement);
        return minElement;
    }

    public static void main(String[] args) {
        int[][] matrix = createMatrix(14);
        getMinElementInMatrix(matrix);

        printMatrix(matrix);
        permutationRowsAndColumnsMatrix(matrix, 2, 3);
    }
}
