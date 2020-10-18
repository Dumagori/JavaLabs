package com.ops;

import java.util.Scanner;

public class MatrixAnalyzer {
    static final int LOW = 0;
    static final int HIGH = 10;

    /// <Summary>
    /// Генерация случайных значений в диапазоне и заполнение ими маатрицы
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
    /// Ручное заполнение матрицы
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
    /// Вывод матрицы на экран
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
    /// Поиск максимального значения матрицы
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
    /// Поиск минимального значения матрицы
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
    /// Среднее арифметическое значений матрицы
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
    /// Среднее геометрическое значений матрицы
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
    /// Точка запуска
    /// </Summary
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("\nВведите высоту: ");
        int matrixHeight = scan.nextInt();

        System.out.print("Введите ширину: ");
        int matrixWidth = scan.nextInt();

        int[][] matrix = new int[matrixHeight][matrixWidth];

        System.out.print("Заполнение (рандом/ручное): ");
        int choose = scan.nextInt();

        switch (choose) {

            case 0:
                matrix = randomGenerate(matrix);
                break;
            case 1:
                matrix = manualFilling(matrix);
                break;
            default:
                System.out.println("Вариант отсутствует!");
        }

        printMatrix(matrix);

        System.out.println("Максимальный элемент: " + maxValue(matrix));
        System.out.println("Минимальный элемент: " + minValue(matrix));
        System.out.println("Среднее арифметическое: " + arithmeticalMean(matrix));
        System.out.println("Среднее геометрическое: " + geometricMean(matrix));
    }
}
