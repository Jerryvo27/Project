package com.trungtamjava.main;

public class Chair {
    String color;
    int height;
    String material;
public Chair(){

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

    public Chair(String color, int height){
    this.color = color;
    this.height = height;

}
}
