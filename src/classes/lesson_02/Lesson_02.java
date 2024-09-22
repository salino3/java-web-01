package classes.lesson_02;

import classes.CalcutationInstruction;

public class Lesson_02 {
   UtilLesson sumUtil1;

   public static void greetingFromLesson_02() {
      System.out.println("Hello from greetingFromLesson_02 class!");
   }

   public void executeAllLesson_02() {
      sumUtil1 = new UtilLesson();
      this.sumUtil1.sumUtil();

   }
}