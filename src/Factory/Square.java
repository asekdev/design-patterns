package Factory;

public class Square implements Shape {

    public Square() {
    }

    @Override
    public void draw() {
        System.out.println("Drawing a square!");
    }
}

