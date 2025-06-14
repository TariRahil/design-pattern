package simplePrototype;

import simplePrototype.shapes.Circle;
import simplePrototype.shapes.Rectangle;
import simplePrototype.shapes.Shape;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        List<Shape> shapesCopy = new ArrayList<>();

        Circle circle = new Circle();
        circle.setX(10);
        circle.setY(20);
        circle.setRadius(15);
        circle.setColor("blue");
        shapes.add(circle);

        Circle circle1 = (Circle) circle.doClone();
        shapes.add(circle1);

        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(10);
        rectangle.setHeight(20);
        rectangle.setColor("red");
        shapes.add(rectangle);

        Rectangle rectangle1 = (Rectangle) rectangle.doClone();
        shapes.add(rectangle1);

        cloneAndCompare(shapes, shapesCopy);
    }

    private static void cloneAndCompare(List<Shape> shapes, List<Shape> shapesCopy) {
        for(var shape: shapes)
            shapesCopy.add(shape.doClone());

        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i) != shapesCopy.get(i)) {
                System.out.println(i + "shapes are defferent objects.");
                if (shapes.get(i).equals(shapesCopy.get(i)))
                    System.out.println(i + " and they are identical.");
                else
                    System.out.println(i + " but they are not identical.");
            } else
                System.out.println(i + "shape objects are the same.");
        }
    }
}
