package classes;

public class CalcutationInstruction {
    String instruction = null;
    int operand1 = 10;
    int operand2 = 2;
    int result = 0;

    public CalcutationInstruction() {

    }

    public static void GreetingFromCalcutationInstruction() {
        System.out.println("Hello from CalcutationInstruction class!");
    }

    public void executeInstruction(String value) {
        this.instruction = value;

        if (instruction.equals("sum")) {
            System.out.println(result = operand1 + operand2);
        } else if (instruction.equals("subtract")) {
            System.out.println(result = operand1 - operand2);
        } else if (instruction.equals("multiply")) {
            System.out.println(result = operand1 * operand2);
        } else if (instruction.equals("divide")) {
            System.out.println(result = operand1 / operand2);
        } else {
            System.out.println("Invalid instruction..");
        }
    }

}
