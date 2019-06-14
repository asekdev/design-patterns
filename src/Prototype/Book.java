package Prototype;

public class Book {

    private String name;
    private int bookID;

    public Book(String name, int bookID) {
        this.name = name;
        this.bookID = bookID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", bookID=" + bookID +
                '}';
    }
}
