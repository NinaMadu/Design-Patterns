package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("-------------Observer pattern--------------");
        System.out.println("Lets play on youtube...");

        Channel C1 = new Channel("Nina Vlogs");
        Video V1 = new Video("V1");
        Subcriber S1 = new Subcriber("Imalsha");
        Subcriber S2 = new Subcriber("Imuu");
        Subcriber S3 = new Subcriber("Imaa");
        Subcriber S4 = new Subcriber("Imii");

        C1.subscribe(S1);
        C1.subscribe(S2);
        C1.subscribe(S3);
        C1.subscribe(S4);


        C1.printSub();

        C1.addVideo(V1);


    }
}