package classes;

public class Operations {
    public int result;

    public Operations() {
        int num_1 = 4;
        int num_2 = 4;
        // * this.result = (num_1 + num_2) / 2; // 4
        this.result = num_1 + num_2 / 2; // 6
    }

    // Method for print 'result' (optional)
    public void printResult() {
        System.out.println("Result: " + this.result);
    }
}
