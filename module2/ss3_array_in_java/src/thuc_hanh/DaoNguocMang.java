package thuc_hanh;

import java.util.Scanner;

public class DaoNguocMang {
    public static void main(String[] args) {
        int size;
        int[] array;
        int i = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter a size: ");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("Size does not exceed 20");
            }
        } while (size > 20);
        array = new int[size];
        while (i < array.length) {
            System.out.println("enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }
        for (int j = 0; j < array.length / 2; j++) {
            int temp = array[j];
            array[j] = array[size - 1 - j];
            array[size - 1 - j] = temp;
        }
        System.out.println("Reverse array: ");
        for (int j :
                array) {
            System.out.print(j + "\t");
        }
    }
}
