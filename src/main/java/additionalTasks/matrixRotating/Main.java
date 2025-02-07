package additionalTasks.matrixRotating;

import java.util.Random;

import static java.lang.Integer.SIZE;

public class Main {

    public static void main(String[] args) {

        int SIZE = 8;
        int[][] colors = new int[SIZE][SIZE];

        Random random = new Random();
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                // для случайных значений воспользуемся готовым решением из библиотеки java.util.Random
                colors[i][j] = random.nextInt(256);
            }
        }
        System.out.println("Вывод матрицы до поворота\n");
        printMatrix(colors);

        // поворот матрицы
        int[][] rotatedColors = rotateMatrix(colors);

        System.out.println("\nВывод матрицы после поворота\n");
        printMatrix(rotatedColors);


    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.format("%4d", matrix[i][j]);
            }
            System.out.println();
        }
    }

    public static int[][] rotateMatrix(int[][] matrix) {
        int n = matrix.length;
        int[][] rotated = new int[n][n];
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                rotated[j][n - 1 - i] = matrix[i][j];
            }
        }
        return rotated;
    }
}