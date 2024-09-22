package classes.lesson_02;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.InputMismatchException;

public class ExerciseHoliday {

    public void calculateHoliday() {
        Map<String, Integer> keys = new HashMap<>();

        Scanner scanner = new Scanner(System.in);

        keys.put("customerService", 1);
        keys.put("logistic", 2);
        keys.put("manager", 3);

        String name = "";
        int keyWorker = 0;
        int seniority = 0;

        System.out.println("What's your name?");
        name = scanner.nextLine();
        if (name.trim().isEmpty()) {
            System.out.println("Error: Please enter a valid name.");
            return;
        }

        do {
            System.out.println("Insert key of department?");
            try {
                keyWorker = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Error: Please enter a valid number.");
                // for stop Scanner.nextInt()
                scanner.next();
            }
        } while (true);

        do {
            System.out.println("Insert seniority in the departament?");
            try {
                keyWorker = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Error: Please enter a valid number.");
                // for stop Scanner.nextInt()
                scanner.next();
            }
        } while (true);

        //
        if (seniority == 0) {
            System.out.println(name + ", sorry you don't have any holiday");
            // customerService
        } else if (keyWorker == keys.get("customerService")) {
            if (seniority == 1) {
                System.out.println(name + ", you have 6 days of holiday");
            } else if (seniority >= 2 && seniority <= 6) {
                System.out.println(name + ", you have 14 days of holiday");
            } else {
                System.out.println(name + ", you have 20 days of holiday");
            }
            // logistic
        } else if (keyWorker == keys.get("logistic")) {
            if (seniority == 1) {
                System.out.println(name + ", you have 7 days of holiday");
            } else if (seniority >= 2 && seniority <= 6) {
                System.out.println(name + ", you have 15 days of holiday");

            } else {
                System.out.println(name + ", you have 22 days of holiday");
            }
            // manager
        } else if (keyWorker == keys.get("manager")) {
            if (seniority == 1) {
                System.out.println(name + ", you have 10 days of holiday");

            } else if (seniority >= 2 && seniority <= 6) {
                System.out.println(name + ", you have 20 days of holiday");
            } else {
                System.out.println(name + ", you have 30 days of holiday");
            }
        } else {
            System.out.println("Invalid key departament. Please insert a valid key.");
        }

    }
}
