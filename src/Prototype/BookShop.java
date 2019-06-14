package Prototype;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable {

    private String name;
    private List<Book> books = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Book> getBooks() {
        return this.books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public void loadData() {
        //Simulating db adding to books array

        for(int i=1; i <= 5; i++) {

            String bookName = "Book " + i;
            Book book = new Book(bookName, i);

            this.getBooks().add(book);
        }
    }

    @Override
    public String toString() {
        return "BookShop{" +
                "name='" + name + '\'' +
                ", books=" + books +
                '}';
    }

    @Override
    protected BookShop clone() throws CloneNotSupportedException {

        BookShop bsClone = new BookShop();

        for(Book b : this.getBooks()) {
            bsClone.getBooks().add(b);
        }

        return bsClone;
    }
}
