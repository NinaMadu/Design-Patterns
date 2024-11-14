package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("-----This is factory design pattern------");
        System.out.println("We create os for mobile phones..");

        OSfactory Factory = new OSfactory();
        OS newphone = Factory.createOS("Open");
        newphone.OperatingSystem();

        //Factory.createOS("windows");
        //Factory.createOS("Close");



    }
}