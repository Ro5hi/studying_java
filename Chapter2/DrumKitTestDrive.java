package Chapter2;

public class DrumKitTestDrive {
    public static void main(String [] args) {

        DrumKit d = new DrumKit();
    
        if (d.snare == true) {
            d.playSnare();
        }
        d.snare = false;
        d.playTopHat();
    }
    
}

// bang bang ba-bang
// ding ding da-ding