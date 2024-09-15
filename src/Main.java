public class Main {
    public static void main(String[] args) {
        Sum obj1 = new Sum();
        // print and jump of line
        System.out.println(obj1.age);

        System.out.println("Hello, World!");

        // * Static method is called directly from the class and not from the instance
        // obj1.sumNumbers(args);
        Sum.sumNumbers(args);
    }
}
