package Adapter;

public class PilotPen {

    public PilotPen() {
    }

    public void mark(String str) {
        System.out.println("Hitting adaptee");
        System.out.println(str);
    }
}
