package com;

public class Light {

    private boolean on;

    public void switchOn(){
        this.on = true;
    }

    public void switchOff(){
        this.on = false;
    }

    public void printStatus(){
        System.out.println(this.on);
    }
}
