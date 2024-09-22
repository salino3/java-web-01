package classes.lesson_02;

public class Lesson_02 {
   UtilLesson sumUtil1;
   ExerciseHoliday calculateHoliday;

   public static void greetingFromLesson_02() {
      System.out.println("Hello from greetingFromLesson_02 class!");
   }

   public void executeAllLesson_02() {
      sumUtil1 = new UtilLesson();
      calculateHoliday = new ExerciseHoliday();

      // this.sumUtil1.sumUtil();
      this.calculateHoliday.calculateHoliday();

   }
}