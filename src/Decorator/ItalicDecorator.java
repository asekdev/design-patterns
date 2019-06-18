package Decorator;

import java.util.HashSet;

public class ItalicDecorator extends TextDecorator {

    public ItalicDecorator(ITextFormat iTextFormat) {
        super(iTextFormat);
    }

    @Override
    public HashSet getFormats() {
        iTextFormat.getFormats().add("ITALIC");
        return iTextFormat.getFormats();
    }
}
