package org.example;

public class RealImage implements Image{
    private String imgName;

    public RealImage(String ImgName){
        this.imgName = ImgName;
        System.out.println("Real image is created..");
        this.loadImage();
    }

    @Override
    public void display() {
        System.out.println(this.imgName + "Image is displayed..");
    }

    public void loadImage(){
        System.out.println(this.imgName + ", Image is loaded from disk..");
    }
}
