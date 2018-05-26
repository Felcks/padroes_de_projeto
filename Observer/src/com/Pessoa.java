package com;

public class Pessoa implements BoloObserver {

    @Override
    public void boloPronto() {
        System.out.println("Estou a caminho");
    }
}
