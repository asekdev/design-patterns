package Decorator;

import java.util.HashSet;

public class BoldDecorator extends TextDecorator {

    public BoldDecorator(ITextFormat iTextFormat) {
        super(iTextFormat);
    }

    @Override
    public HashSet getFormats() {
        iTextFormat.getFormats().add("BOLD");
        return iTextFormat.getFormats();
    }
}
