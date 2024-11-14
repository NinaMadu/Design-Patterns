package org.example;

public class ProxyImage implements Image{
    private Image image;
    private final String imgName;

    public ProxyImage(String imgName){
        this.imgName = imgName;
    }

    @Override
    public void display() {
        if(image == null){
            image = new RealImage(imgName);
        }
        image.display();
    }
}
