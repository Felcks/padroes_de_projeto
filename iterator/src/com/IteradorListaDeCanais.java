package com;

import java.util.ArrayList;

public class IteradorListaDeCanais implements IteradorInterface {

    private int currentIndex = 0;
    private ArrayList<Canal> canais;

    public IteradorListaDeCanais(ArrayList<Canal> canais){
        this.canais = canais;
    }

    @Override
    public void next() {
        currentIndex++;
    }

    @Override
    public void fist() {
        currentIndex  = 0;
    }

    @Override
    public Boolean isDone() {
        return currentIndex >= canais.size();
    }

    @Override
    public Canal currentItem() {
        return canais.get(currentIndex);
    }
}
