package Chapter2;

public class GuessGame {
    Player p1;
    Player p2;
    Player p3;
    // GuessGame has three instance variables for the three player objects

    public void startGame() {
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();
        // create three player objects and assign them to three player instance variables

        int guessp1 = 0;
        int guessp2 = 0;
        int guessp3 = 0;
        // declare 3 variables to hold the three guesses the players make

        boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false; 
        // declare 3 variables to hold a true or false based on player's answer

        int targetNumber = (int) (Math.random() * 10); 
        System.out.println("I'm thinking of a number between 0 and 9..."); 
        // make a 'target' number that the players have to guess

        while(true) {
            System.out.println("Number to guess is " + targetNumber);

            p1.guess();
            p2.guess();
            p3.guess();
            // call each player's guess() method

            guessp1 = p1.number;
            System.out.println("Player one guessed " + guessp1);

            guessp2 = p2.number;
            System.out.println("Player two guessed " + guessp2);

            guessp3 = p3.number;
            System.out.println("Player three guessed " + guessp3);

            if (guessp1 == targetNumber) {
                p1isRight = true;
            }
            if (guessp2 == targetNumber) {
                p2isRight = true;
            }
            if (guessp3 == targetNumber) {
                p3isRight = true;
            }
            /*check each guess to see if it matches, if right then set player's variable
            to be true (set to false by default) */

            if (p1isRight || p2isRight || p3isRight) {
            // if p1 or p2 or p3 is right 

                System.out.println("We have a winner!");
                System.out.println("Player one got it right!" + p1isRight);
                System.out.println("Player two got it right!" + p2isRight);
                System.out.println("Player three got it right!" + p3isRight);
                System.out.println("Game is over.");
                break;
            } else {
                System.out.println("Players will have to try again.");
                // otherwise stay in the loop and ask players for another guess
            }
        }
    }

}

