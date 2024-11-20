package org.example;

public class Singleton {
    public String name;
    private static Singleton instance;

    // private constructor
    private Singleton(String name){
        this.name = name;
        System.out.println("The instance is created..");
    }

    // global static method to access the instance
    public static Singleton getSingleton(String name){
        if(instance == null){
            instance = new Singleton(name);
        }
        return instance;
    }

    void display(){
        System.out.println("Displaying: "+name);
    }


}
