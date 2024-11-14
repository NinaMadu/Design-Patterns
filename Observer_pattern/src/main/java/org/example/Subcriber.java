package org.example;

public class Subcriber {
    private String name;
    private Channel channel;

    public void update(){
        System.out.println("New video is added!");
    }

    Subcriber(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Channel getChannel() {
        return channel;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setChannel(Channel channel) {
        this.channel = channel;
    }

    public void notifySubscriber(){
        System.out.println("new video uploaded..");
    }
}
