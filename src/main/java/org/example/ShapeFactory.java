package org.example;

public class ShapeFactory {
    public Shape getShape(String shapeName) {
        if (shapeName == null) {
            return null;
        }
        if (shapeName.equalsIgnoreCase("Circle")) {
            return new Circle();
        } else if (shapeName.equalsIgnoreCase("Tectangle")) {
            return new Rectangle();
        } else if (shapeName.equalsIgnoreCase("Triangle")) {
            return new Triangle();
        }
        return null;
    }
}
