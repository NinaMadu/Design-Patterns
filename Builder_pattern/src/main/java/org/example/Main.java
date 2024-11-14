package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("-------- This is builder pattern ----------");
        System.out.println("Building a phone with custom specifications");

        Phone myPhone = new PhoneBuilder().setBattery("5000mah").setBrand("Samsung").setOs("Android").buildPhone();
        System.out.println("My new phone" + myPhone.toString());

    }
}