package classes;

public class Lesson_01 {

    Rating rating1 = new Rating();

    public Lesson_01() {

        System.out.println(rating1.rating);
    }

    public void printResultRating() {
        rating1.printResultRating();
    }

    public int getRatingValue() {
        return rating1.rating;
    }

}
