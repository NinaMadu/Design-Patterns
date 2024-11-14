package org.example;

public class Phone {
    private String os;
    private String brand;
    private String battery;
    private int ram;
    private int year;
    private int size;

    public Phone(String os, String brand, String battery, int ram, int year, int size) {
        this.os = os;
        this.brand = brand;
        this.battery = battery;
        this.ram = ram;
        this.year = year;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "OS='" + os + '\'' +
                ", Brand='" + brand + '\'' +
                ", Battery='" + battery + '\'' +
                ", RAM=" + ram + "GB" +
                ", Year=" + year +
                ", Size=" + size + " inches" +
                '}';
    }
}
