package com;

public class FolhaNavalhaAdapter extends FolhaNavalha implements Ataque {


    @Override
    public void atacar(Pokemon aliado, Pokemon inimigo) {
        this.atacar(inimigo);
    }
}
