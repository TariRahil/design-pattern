package prototypeRegistery.cache;

import simplePrototype.shapes.Circle;
import simplePrototype.shapes.Rectangle;
import simplePrototype.shapes.Shape;

import java.util.HashMap;
import java.util.Map;

public class BundledShapeCache {
    private Map<String, Shape> cache = new HashMap<>();

    public BundledShapeCache() {
        Circle circle = new Circle();
        circle.setX(10);
        circle.setY(20);
        circle.setRadius(15);
        circle.setColor("red");

        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(10);
        rectangle.setHeight(20);
        rectangle.setX(2);
        rectangle.setY(3);
        rectangle.setColor("green");

        cache.put("red circle", circle);
        cache.put("green rectangle", rectangle);
    }

    public Shape put(String key, Shape shape) {
        cache.put(key, shape);
        return shape;
    }

    public Shape get(String key) {
        return cache.get(key).doClone();
    }
}
