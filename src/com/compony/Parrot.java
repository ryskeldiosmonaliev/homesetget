package com.compony;

public class Parrot {
    private String name;
    private String color;
    private double whole;
    private int age;

    void setName(String uzerName) {
        this.name = uzerName;
    }

    String getName() {
        return name;
    }


    void setColor(String uzerColor) {
        this.color = uzerColor;
    }
    String getColor(){
    return color;
    }

    void setWhole(double uzerWhole) {
        this.whole = uzerWhole;
    }
    double getWhole(){
        return whole;
    }
    void setAge(int uzerAge){
        this.age=uzerAge;
    }
    int getAge(){
        return age;
    }
}
