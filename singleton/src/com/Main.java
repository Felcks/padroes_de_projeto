package com;

public class Main {

    public static void main(String[] args){

        Incremental.getInstance().aumentarContador();
        Incremental.getInstance().aumentarContador();
        Incremental.getInstance().aumentarContador();
        Incremental.getInstance().aumentarContador();

        System.out.print(Incremental.getInstance().getContador());
    }
}
