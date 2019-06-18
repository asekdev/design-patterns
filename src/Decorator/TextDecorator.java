package Decorator;

import java.util.HashSet;

abstract class TextDecorator implements ITextFormat {

    protected ITextFormat iTextFormat;

    public TextDecorator(ITextFormat iTextFormat) {
        this.iTextFormat = iTextFormat;
    }

    @Override
    public HashSet<String> getFormats() {
        return this.iTextFormat.getFormats();
    }

}
