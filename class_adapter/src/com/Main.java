package com;

public class Main {

    public static void main(String[] args){

        Ataque ataque = new FolhaNavalhaAdapter();
        Ataque cura = new CurarAdapter();

        Pokemon aliado = new Pokemon("Charmander", cura);
        Pokemon inimigo = new Pokemon("Pikachu", ataque);

        aliado.ataque.atacar(aliado, inimigo);
    }
}
