package com;

public class Main {

    public static void main(String[] args){
        /*Sem o façade
        System.out.println("##### Configurando subsistemas #####");
        SistemaDeAudio audio = new SistemaDeAudio();
        audio.configurarCanais();
        audio.configurarFrequencia();
        audio.configurarVolume();

        System.out.println("##### Utilizando subsistemas #####");
        audio.reproduzirAudio("teste.mp3"); */

        /* Com o facade */
        SistemasFacade facade = new SistemasFacade();
        facade.inicializarSubsistemas();
        facade.reproduzirAudio("teste.mp3");
    }
}
