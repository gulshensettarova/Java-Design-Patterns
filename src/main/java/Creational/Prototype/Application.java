package Creational.Prototype;

public class Application {
    public static void main(String[] args) throws CloneNotSupportedException {
        BookCloneable b1=new BookCloneable("Da Vinci Code","Dan Brown",516);
        BookCloneable b2= (BookCloneable) b1.clone();
    }


}
