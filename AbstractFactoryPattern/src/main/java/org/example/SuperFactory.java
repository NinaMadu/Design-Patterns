package org.example;

public class SuperFactory {
    public static AbstractFactory createFactory(String factory){
        if(factory.equalsIgnoreCase("Shape")){
            System.out.println("Shape factory created successfully!");
            return new ShapeFactory();
        }
        else if(factory.equalsIgnoreCase("Color")){
            System.out.println("Color factory created successfully!");
            return new ColorFactory();
        }
        return null;
    }

}

