package org.example;

public class OSfactory {

    public OS createOS(String input){
        if(input.equals("Open")){
            return new Android();
        }
        else if(input.equals("Close")){
            return new IOS();
        }
        else {
            return new Windows();
        }
    }
}
