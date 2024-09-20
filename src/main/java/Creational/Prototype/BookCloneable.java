package Creational.Prototype;

public class BookCloneable implements  Cloneable {
    private String title;
    private String author;
    private int pages;

    public BookCloneable(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;

    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        return  (BookCloneable) super.clone();

    }
}
