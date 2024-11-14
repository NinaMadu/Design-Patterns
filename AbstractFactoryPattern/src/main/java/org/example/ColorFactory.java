package org.example;

public class ColorFactory extends AbstractFactory{
    @Override
    public Color getColor(String color) {
        if(color.equalsIgnoreCase("Red")){
            System.out.println("Red created successfully!");
            return new Red();
        }
        else if(color.equalsIgnoreCase("Green")){
            System.out.println("Green created successfully!");
            return new Green();
        }
        if(color.equalsIgnoreCase("Blue")){
            System.out.println("Blue created successfully!");
            return new Blue();
        }
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
