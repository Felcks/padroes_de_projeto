package com;

public class Main {

    public static void main(String[] args){

        FlyweightFactory factory = new FlyweightFactory();
        Ponto ponto = new Ponto(10,0);

        SpriteFlyweight novo = factory.getFlyweight(FlyweightFactory.Sprites.GUERREIRO);
        novo.desenharImagem(ponto);

        SpriteFlyweight novo2 = factory.getFlyweight(FlyweightFactory.Sprites.GUERREIRO);
        novo2.desenharImagem(ponto);
    }
}
