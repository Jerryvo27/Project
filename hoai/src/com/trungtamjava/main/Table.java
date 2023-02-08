package com.trungtamjava.main;

public class Table {
    String color;
    int height;
    String material;
public Table(){

}
public Table(int height, String color){
    this.height = height;
    this.color = color;

}

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
