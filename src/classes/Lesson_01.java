package classes;

public class Lesson_01 {

    Rating rating1, rating2;

    public Lesson_01() {
        this.rating1 = new Rating(3, 8, 6);
        this.rating2 = new Rating(8, 10, 9);

        System.out.println(rating1.rating);
    }

    public void printResultRating() {
        rating1.printResultRating();
        rating2.printResultRating();
    }

    public int getRatingValue() {
        return rating1.rating;
    }

}
