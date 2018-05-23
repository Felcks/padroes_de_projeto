package com;

public class Main {

    public static void main(String[] args){

        Creso creso = new Creso();
        Deus apolo = new Oraculo();

        if(apolo instanceof Oraculo)
            ((Oraculo) apolo).pagarTaxa();
        apolo.responderPergunta("Vou a guerra?");

    }
}
