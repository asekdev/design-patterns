package Strategy;

public class MacoLanguage extends LanguageStrategy {

    public MacoLanguage() {}

    @Override
    public String translateHello() {
        return "Kako si";
    }

    @Override
    public String getLanguage() {
        return "Macedonian";
    }
}
