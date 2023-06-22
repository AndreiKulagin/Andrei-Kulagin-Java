package main.java.com.Aston.testTask;

public class Output {

    public static void printMessage() {
        System.out.println("Привет");
    }

    public static void printGreeting(String name) {
        System.out.println("Привет, " + name);
    }

    public static void printMultiplesOfThree(int[] array) {
        System.out.println("Элементы массива, кратные 3:");

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 3 == 0) {
                System.out.println(array[i]);
            }
        }
    }
}