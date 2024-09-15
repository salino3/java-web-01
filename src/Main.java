import classes.Sum;
import classes.Lesson_01;
import classes.Operations;

public class Main {
    public static void main(String[] args) {
        Sum obj1 = new Sum();
        Operations op1 = new Operations();
        Lesson_01 lesson1 = new Lesson_01();

        // print and jump of line
        System.out.println("Hello, World!");
        System.out.println(obj1.age);
        op1.printResult();

        // * Static method is called directly from the class and not from the instance
        // obj1.sumNumbers(args);
        Sum.sumNumbers(args);
        System.out.println("------------------------------------");
        lesson1.printResultRating();
        System.out.println(lesson1.getRatingValue());
        System.out.println(lesson1.getRatingValue() + "10");
        lesson1.executeAllLesson_01();
        Lesson_01.GreetingFromCalcutationInstruction();
        System.out.println(5 + 7 % 3);

    }
}
