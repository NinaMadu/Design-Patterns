package org.example;

public class ShapeFactory extends AbstractFactory{
    @Override
    Color getColor(String color) {
        return null;
    }

    @Override
    Shape getShape(String shape) {
        if(shape.equalsIgnoreCase("Rectangle")){
            System.out.println("Rectangle created successfully!");
            return new Rectangle();
        }
        else if(shape.equalsIgnoreCase("Trangle")){
            System.out.println("Trangle created successfully!");
            return new Trangle();
        }
        else if(shape.equalsIgnoreCase("Circle")){
            System.out.println("Circle created successfully!");
            return new Circle();
        }
        return null;
    }
}
