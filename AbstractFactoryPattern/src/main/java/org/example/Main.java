package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("----------- Abstract Factory Pattern -------------");
        System.out.println("Create factory for shape and color");

        AbstractFactory myShapeFactory = SuperFactory.createFactory("Shape");
        Shape myShape = myShapeFactory.getShape("Rectangle");

        myShape.draw();





    }
}