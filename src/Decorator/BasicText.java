package Decorator;

import java.util.HashSet;

public class BasicText implements ITextFormat {

    private HashSet<String> formats = new HashSet<>();

    @Override
    public HashSet<String> getFormats() {
        return this.formats;
    }
}
