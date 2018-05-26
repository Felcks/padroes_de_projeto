package com;

public class Rei implements BoloObserver {

    @Override
    public void boloPronto() {
        System.out.println("Traga até a mim");
    }
}
