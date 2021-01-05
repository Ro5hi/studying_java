package Chapter2;

public class TapeDeck {
   TapeDeck t;

   boolean canRecord = false;
   
   public void playTape() {
       System.out.println("*tape playing*");
   }
   public void recordTape() {
       System.out.println("*tape recording*");
   }

   class TapeDeckTestDrive {
       public static void main(String [] args) {

        t.canRecord = true;
        t.playTape();

        if (t.canRecord == true) {
            t.recordTape = true;
        }
       }
   }
}
