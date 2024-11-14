package org.example;

public class PhoneBuilder {
    private String os;
    private String brand;
    private String battery;
    private int ram;
    private int year;
    private int size;

    public PhoneBuilder setOs(String os) {
        this.os = os;
        return this;
    }

    public PhoneBuilder setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public PhoneBuilder setBattery(String battery) {
        this.battery = battery;
        return this;
    }

    public PhoneBuilder setRam(int ram) {
        this.ram = ram;
        return this;
    }

    public PhoneBuilder setYear(int year) {
        this.year = year;
        return this;
    }

    public PhoneBuilder setSize(int size) {
        this.size = size;
        return this;
    }

    public Phone buildPhone(){
        return new Phone( os, brand, battery, ram, year, size);
    }
}
