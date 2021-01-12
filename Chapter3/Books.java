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
        myBooks[0] = new Books();
        myBooks[1] = new Books();
        myBooks[2] = new Books();


        myBooks[0].title = "The Grapes of Java";
        myBooks[1].title = "The Java Gatsby";
        myBooks[2].title = "The Java CookBook";
        myBooks[0].author = "Bob";
        myBooks[1].author = "Sue";
        myBooks[2].author = "Ian";

        int x = 0;
        System.out.print(myBooks[x].title);
        System.out.print(" by ");
        System.out.println(myBooks[x].author);

        while (x < myBooks.length) {
            x = x + 1;
        }
    }
}
