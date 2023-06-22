package main.java.com.Aston.testTask;

import java.util.Scanner;

public class Input {
    public static int getNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter some number:");
        return scanner.nextInt();
    }

    public static String getName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name:");
        return scanner.nextLine();
    }

    public static int[] getArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            System.out.print("Элемент " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        return array;
    }
}