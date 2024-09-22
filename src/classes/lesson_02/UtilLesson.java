package classes.lesson_02;

import java.util.Scanner;

public class UtilLesson {
    // with method 'main()'
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String name = "";
        int num1 = 0, num2 = 0, result = 0;

        System.out.println("What's your name?");
        name = scanner.nextLine();

        System.out.println("What's the first value for the sum?");
        num1 = scanner.nextInt();

        System.out.println("What's the second value for the sum?");
        num2 = scanner.nextInt();

        result = num1 + num2;
        System.out.println(name + ", the sum of " + num1 + " and " + num2 + " is: " + result);
    }

    public static void sumUtil() {
        Scanner scanner = new Scanner(System.in);
        String name = "";
        int num1 = 0, num2 = 0, result = 0;

        System.out.println("What's your name?");
        name = scanner.nextLine();

        System.out.println("What's the first value for the sum?");
        num1 = scanner.nextInt();

        System.out.println("What's the second value for the sum?");
        num2 = scanner.nextInt();

        result = num1 + num2;
        System.out.println(name + ", the sum of " + num1 + " and " + num2 + " is: " + result);
    }
}
