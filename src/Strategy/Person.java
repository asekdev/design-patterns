package Strategy;

public class Person {

    private String name;
    private LanguageStrategy language;

    public Person(){}

    public Person(String name, LanguageStrategy language) {
        this.language = language;
    }

    public String helloInLanguage() {
        return this.language.translateHello();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printHelloInLanguage() {
        System.out.println("Hello in " + this.language.getLanguage() + ": " + this.language.translateHello());
    }

}
