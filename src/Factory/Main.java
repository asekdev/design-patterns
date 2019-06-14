package Factory;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ShapeFactory factory = new ShapeFactory();

        Shape triangle = factory.getInstance("triangle");
        Shape circle = factory.getInstance("circle");
        Shape square = factory.getInstance("square");

        List<Shape> bucketOfShapes = new ArrayList<>();

        bucketOfShapes.add(triangle);
        bucketOfShapes.add(circle);
        bucketOfShapes.add(square);

        for(Shape shape : bucketOfShapes) {
            shape.draw();
        }


    }
}
