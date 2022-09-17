package org.example;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape1 = shapeFactory.getShape("triangle");
        shape1.drwa();

        Shape shape2 = shapeFactory.getShape("circle");
        shape2.drwa();

        Shape shape3 = shapeFactory.getShape("rectangle");
        if (shape3 != null) {
            shape3.drwa();
        }else System.out.println("Shape3 is not available");
    }
}
