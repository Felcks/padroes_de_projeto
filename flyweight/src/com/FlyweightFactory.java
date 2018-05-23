package com;

import java.util.ArrayList;

public class FlyweightFactory {

    protected ArrayList<SpriteFlyweight> flyweights;

    public enum Sprites {
        GUERREIRO, MAGO
    }

    public FlyweightFactory() {
        flyweights = new ArrayList<SpriteFlyweight>();
        flyweights.add(new Sprite("guerreiro.png"));
        flyweights.add(new Sprite("mago.png"));
    }

    public SpriteFlyweight getFlyweight(Sprites jogador) {
        switch (jogador) {
            case GUERREIRO:
                return flyweights.get(0);
            case MAGO:
                return flyweights.get(1);
            default:
                return flyweights.get(0);
        }
    }
}
