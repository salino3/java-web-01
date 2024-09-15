package classes;

public class Lesson_01 {

    Rating rating1, rating2;
    CalcutationInstruction executeInstruction1;

    public Lesson_01() {
        int noteMath = 3;
        this.rating1 = new Rating(noteMath, 8, 6);
        this.rating2 = new Rating(8, 10, 9);

        System.out.println(rating1.rating);

    }

    public void executeAllLesson_01() {
        String description = "multiply";
        this.executeInstruction1 = new CalcutationInstruction();
        System.out.print("Result: ");
        this.executeInstruction1.executeInstruction(description);

    }

    public void printResultRating() {
        rating1.printResultRating();
        rating2.printResultRating();
    }

    public int getRatingValue() {
        return rating1.rating;
    }

    public static void GreetingFromCalcutationInstruction() {
        CalcutationInstruction.GreetingFromCalcutationInstruction();
    }

}
