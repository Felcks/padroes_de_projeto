package com;

public class MarioMorto implements MarioState {

    @Override
    public MarioState pegarCogumelo() {
        System.out.println("Mario morto");
        return new MarioMorto();
    }

    @Override
    public MarioState pegarFlor() {
        System.out.println("Mario morto");
        return new MarioMorto();
    }

    @Override
    public MarioState pegarPena() {
        System.out.println("Mario morto");
        return new MarioMorto();
    }

    @Override
    public MarioState levarDano() {
        System.out.println("Mario morto");
        return new MarioMorto();
    }
}
