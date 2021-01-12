package Chapter3;

class Hobbits {
    String name;

    public static void main(String [] args) {

        Hobbits [] h = new Hobbits[3];

        int z = -1;
        // needed to start with 0 to compile boolean code
        while (z < 2) {
            z = z + 1;
            h[z] = new Hobbits();
            h[z].name = "Bilbo";
            if (z == 1) {
                h[z].name = "Frodo";
            }
            if  (z == 2) {
                h[z].name = "Sam";
            }
            System.out.print(h[z].name + " is a ");
            System.out.print("good Hobbit name! ");
        }
    }
}