package com;

public class CurarAdapter extends Curar implements Ataque{
    @Override
    public void atacar(Pokemon aliado, Pokemon inimigo) {
        this.curar(aliado);
    }
}
