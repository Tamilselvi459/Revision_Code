
         abstract class car {
          public int a = 20;

          abstract void color();

          public void brake() {
              System.out.println("brake");
          }

      }

      class maruthi extends car{

          @Override
          void color() {
              System.out.println("color");
          }

          public void brake() {
              System.out.println("brake in example8");
          }
      }
         public class Example8 {
      public static void main(String[] args){
          maruthi ex = new maruthi();
        ex.color();
        ex.brake();
        car end = new maruthi();
        end.brake();
      }
  }

