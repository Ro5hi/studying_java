package Chapter3;

import java.awt.print.Book;

import static java.lang.System.out;

class Books {
    String title;
    String author;
}

class BooksTestDrive {
    public static void main(String [] args) {

        Books[] myBooks = new Books[3];
        // need to create Books in order to compile code
        myBooks[0] = new Books();
        myBooks[1] = new Books();
        myBooks[2] = new Books();


        myBooks[0].title = "The Grapes of Java";
        myBooks[1].title = "The Java Gatsby";
        myBooks[2].title = "The Java CookBook";
        myBooks[0].author = "Bob";
        myBooks[1].author = "Sue";
        myBooks[2].author = "Ian";

        // can change value to print out certain book from 0-2
        int x = 1;
        System.out.print(myBooks[x].title);
        System.out.print(" by ");
        System.out.println(myBooks[x].author);

        while (x < myBooks.length) {
            x = x + 1;
        }
    }
}
