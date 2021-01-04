public class PhraseOMatic {
    public static void main (String[] args) {

        // make three sets of woords to choose from. add your own!
        String[] wordListOne = { "24/7", "coffee", "pencil", "notebook", "wheels", "house", "USB", "afternoon", "morning", "evening", "nap", "sleep", "study"};

        String[] wordListTwo = { "cat", "dog", "mouse", "squirrel", "chinchilla", "kibble", "treats", "bark", "meow", "squeak", "hiss", "squeal", "snore"};

        String[] wordListThree = { "chandelier", "french doors", "kitchenette", "solar panel roof", "office", "common room", "flat", "bedroom", "attic", "bathroom", "guest bath"};

        // find how many words are in each list
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        // generate three random numbers 
        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);

        // now build a phrase 
        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

        // print out the phrase 
        System.out.println("What we need is a" + phrase);
    }       
}
