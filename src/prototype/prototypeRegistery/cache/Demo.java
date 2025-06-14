package prototypeRegistery.cache;

import simplePrototype.shapes.Shape;

public class Demo {
    public static void main(String[] args) {
        BundledShapeCache bundledShapeCache = new BundledShapeCache();

        Shape shape = bundledShapeCache.get("red circle");
        Shape shape1 = bundledShapeCache.get("green rectangle");
        Shape shape2 = bundledShapeCache.get("green rectangle");

        if (shape != shape1 && !shape.equals(shape1))
            System.out.println("red circle != green rectangle");
        else
            System.out.println("red circle == green rectangle");

        if (shape1 != shape2) {
            System.out.println("green rectangle != green rectangle");
            if (shape1.equals(shape2))
                System.out.println(" And they are identical.");
            else
                System.out.println("but they are not identical.");
        } else
            System.out.println("green rectangles are the same.");
    }
}
