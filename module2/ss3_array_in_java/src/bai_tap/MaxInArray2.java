package bai_tap;

import java.util.Scanner;

public class MaxInArray2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int col = scanner.nextInt();
        int[][] array = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        int indexRow = 0;
        int indexCol = 0;
        int max = array[0][0];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                    indexRow = i;
                    indexCol = j;
                }
            }
        }
        System.out.println("Giá trị lơn nhất trong mảng: " + max + " tại vị trí " + indexRow + " - " + indexCol);
    }
}
