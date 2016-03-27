package day10;

/**
 * Created by arika on 16/3/18.
 */


class Book implements Comparable{
    String title;

    public Book(String title) {
        this.title = title;
    }

    @Override
    public int compareTo(Object o) {
        Book book = (Book)o;
        return (title.compareTo(book.title));
    }
}