package com.compony;

public class Fish {
    private String name;
    private double whole;
    private String view;
    private boolean predator;
    private double length;

    void setName(String uzerName) {
        this.name = uzerName;
    }

    String getName() {
        return name;
    }

    void setWhole(double uzerWhole) {
        this.whole = uzerWhole;
    }

    double getWhole() {
        return whole;
    }

    void setView(String uzerViem) {
        this.view = uzerViem;
    }

    String getView() {
        return view;
    }

    void setPredator(boolean uzerPredator) {
        if (uzerPredator == true) {
            this.predator = uzerPredator;
        }else{

        }
    }

    boolean getPredator() {
        return predator;
    }

    void setLength(double uzerLength) {
        this.length = uzerLength;
    }

    double getLength() {
        return length;
    }
}
