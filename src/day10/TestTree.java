package day10;

import java.util.TreeSet;

/**
 * Created by arika on 16/3/18.
 */
public class TestTree {
    public static void main(String[] args){
        new TestTree().go();
    }

    private void go() {
       Book b1 = new Book("How Cats Word");
        Book b2 = new Book("Remix your Body");
        Book b3 = new Book("Finding Emo");
        BookCompare bCompare = new BookCompare();
        TreeSet<Book> tree = new TreeSet<Book>(bCompare);
        tree.add(b1);
        tree.add(b2);
        tree.add(b3);
        System.out.println(tree);
    }
}
