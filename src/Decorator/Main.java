package Decorator;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {

        TextDecorator text = new BoldDecorator(new ItalicDecorator(new BasicText()));

        text.getFormats();

        System.out.println(text.getFormats());

    }
}
