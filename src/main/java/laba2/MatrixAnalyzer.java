package laba2;

import java.util.Scanner;

public class MatrixAnalyzer {
    private static final int LOW = 0;
    private static final int HIGH = 10;

    /// <Summary>
    /// Generate random value in matrix
    /// </Summary
    private static int[][] randomGenerate(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * (HIGH - LOW) + LOW);
            }
        }

        return matrix;
    }

    /// <Summary>
    /// Manual filling of matrix
    /// </Summary
    private static int[][] manualFilling(int[][] matrix) {
        Scanner scanFillingMatrix = new Scanner(System.in);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("[" + i + ":" + j + "] - ");
                matrix[i][j] = scanFillingMatrix.nextInt();
            }
        }

        return matrix;
    }

    /// <Summary>
    /// Print matrix on screen
    /// </Summary
    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.print("\n");
        }
    }

    /// <Summary>
    /// Find max value
    /// </Summary
    private static int maxValue(int[][] matrix) {
        int max = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }

        return max;
    }

    /// <Summary>
    /// Find min value
    /// </Summary
    private static int minValue(int[][] matrix) {
        int min = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
            }
        }

        return min;
    }

    /// <Summary>
    /// Find arithmetical mean
    /// </Summary
    private static double arithmeticalMean(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
        }

        double count = matrix.length * matrix[0].length;
        double arithmeticalMeanValue = sum / count;

        return arithmeticalMeanValue;
    }

    /// <Summary>
    /// Find geometric mean
    /// </Summary
    private static double geometricMean(int[][] matrix) {
        int product = 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                product *= matrix[i][j];
            }
        }

        double power = 1 / (double) (matrix.length * matrix[0].length);
        double geometricMeanValue = Math.pow(product, power);

        return geometricMeanValue;
    }

    /// <Summary>
    /// Start point
    /// </Summary
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("\nEnter height: ");
        int matrixHeight = scan.nextInt();

        System.out.print("Enter width: ");
        int matrixWidth = scan.nextInt();

        int[][] matrix = new int[matrixHeight][matrixWidth];

        System.out.print("Choose what u wanna (random - 0 | manual - 1): ");
        int choose = scan.nextInt();

        switch (choose) {

            case 0:
                matrix = randomGenerate(matrix);
                break;
            case 1:
                matrix = manualFilling(matrix);
                break;
            default:
                System.out.println("Oooops... Houston, we have a problem!");
        }

        printMatrix(matrix);

        System.out.println("Max value: " + maxValue(matrix));
        System.out.println("Min value: " + minValue(matrix));
        System.out.println("СMean arithmetical: " + arithmeticalMean(matrix));
        System.out.println("Mean geometric: " + geometricMean(matrix));
    }
}
