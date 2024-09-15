import classes.Sum;
import classes.Operations;

public class Main {
    public static void main(String[] args) {
        Sum obj1 = new Sum();
        Operations op1 = new Operations();
        // print and jump of line
        System.out.println("Hello, World!");
        System.out.println(obj1.age);
        op1.printResult();

        // * Static method is called directly from the class and not from the instance
        // obj1.sumNumbers(args);
        Sum.sumNumbers(args);
    }
}
