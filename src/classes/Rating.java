package classes;

public class Rating {
    public int rating = 0;

    public Rating() {

        int math = 5;
        int biologic = 8;
        int chemistry = 7;

        rating = (math + biologic + chemistry) / 3;

    }

    public void printResultRating() {

        System.out.println(rating >= 6 ? "You have approved!" : "You did not approved!");
    }
}
