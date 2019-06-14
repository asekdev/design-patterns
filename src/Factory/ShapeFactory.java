package Factory;

public class ShapeFactory {

    public Shape getInstance(String shape) {
        Shape factoryShape = null;
        if(shape.equalsIgnoreCase("circle")) {
            factoryShape = new Circle();
        }
        else if(shape.equalsIgnoreCase("triangle")) {
            factoryShape = new Triangle();
        }
        else if(shape.equalsIgnoreCase("square")){
            factoryShape = new Square();
        }

       return factoryShape;

    }
}
