package Strategy;

public class ItalianLanguage extends LanguageStrategy {

    @Override
    public String translateHello() {
        return "Ciao";
    }

    @Override
    public String getLanguage() {
        return "Italian";
    }
}
