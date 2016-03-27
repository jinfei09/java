package example;

/**
 * Created by arika on 16/3/10.
 */
public class BooksTestDrive {
    public static void main(String [] args){
        Book [] myBooks = new Book[3];
        int x = 0;
        myBooks[0] = new Book();
        myBooks[1] = new Book();
        myBooks[2] = new Book();

        myBooks[0].title = "The Grapes of Java";
        myBooks[1].title = "The Java Gatsby";
        myBooks[2].title = "The Java Cookbook";

        myBooks[0].author = "bob";
        myBooks[1].author = "sue";
        myBooks[2].author = "ian";

        while(x<3){
            System.out.print(myBooks[x].title);
            System.out.print(" by ");

            System.out.println(myBooks[x].author);
            x = x + 1;
        }
    }
}
