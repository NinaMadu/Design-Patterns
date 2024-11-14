package org.example;

import java.util.ArrayList;
import java.util.List;

public class Channel {
    private String Name;
    private List<Subcriber> subs = new ArrayList<>();
    private List<Video> videos = new ArrayList<>();

    Channel(String Name){
        this.Name = Name;
    }


    public void subscribe(Subcriber sub){
        subs.add(sub);
        sub.setChannel(this);
    }

    public void unsubscribe(Subcriber sub){
        subs.remove(sub);
    }

    public void addVideo(Video video){
        videos.add(video);
        this.updateSubscribers();
    }

    public void removeVideo(Video video){
        videos.remove(video);
    }

    public void printSub(){
        for(Subcriber sub: subs){
            System.out.println(sub.getName());
        }
    }

    public void updateSubscribers(){
        for(Subcriber sub: subs){
            sub.notifySubscriber();
        }
    }


}
