package classes;

public class Rating {
    public int math;
    public int biologic;
    public int chemistry;
    public int rating = 0;

    public Rating(int math, int biologic, int chemistry) {
        this.math = math;
        this.biologic = biologic;
        this.chemistry = chemistry;
        this.rating = (math + biologic + chemistry) / 3;
    }

    public void printResultRating() {

        System.out.println(rating >= 6 ? "You have approved!" : "You did not approved!");
        if (rating >= 6) {
            System.out.println("Bravo!");
        } else {
            System.out.println("You need to work harder!");
        }
    }
}
