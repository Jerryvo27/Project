package com.trungtamjava.main;

public class Laptop {
    int size;
    String color;
    String brand;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Laptop(){

}
public Laptop(int size, String color){
    this.size = size;
    this.color = color;

}
}
