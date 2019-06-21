package Strategy;

public class Main {

    public static void main(String[] args) {

        Person vasil = new Person("Vasil", new MacoLanguage());

        vasil.printHelloInLanguage();

        Person giovanni = new Person("Giovanni", new ItalianLanguage());

        giovanni.printHelloInLanguage();

    }
}
