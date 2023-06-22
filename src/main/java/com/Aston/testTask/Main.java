package main.java.com.Aston.testTask;

public class Main {
    public static void main(String[] args) {
        int number = Input.getNumber();
        if (number > 7) {
            Output.printMessage();
        }

        String name = Input.getName();
        if (name.equals("Вячеслав")) {
            Output.printGreeting(name);
        } else {
            System.out.println("Нет такого имени");
        }
        int[] array = Input.getArray();
        Output.printMultiplesOfThree(array);
    }
}