package Chapter2;

public class DVDPlayerTestDrive {
    public static void main(String [] args) {

        DVDPlayer d = new DVDPlayer();
        d.canRecord = false;
        d.recordDVD();

        if (d.canRecord == true) {
            d.recordDVD();
        }
    }
}