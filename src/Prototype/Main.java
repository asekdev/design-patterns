package Prototype;

public class Main {

    public static void main(String[] args) {
        //Create the bookshop

        BookShop bs1 = new BookShop();
        bs1.loadData();
        bs1.setName("BookShop1");

        System.out.println(bs1);

        //Shallow clone - same reference
        BookShop bs2 = null;
        try {
            bs2 = bs1.clone();

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        bs2.setName("Garry's Book Shop");

        bs2.getBooks().remove(1);
        System.out.println(bs2);
        System.out.println(bs1);
    }

}
