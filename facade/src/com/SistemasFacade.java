package com;

public class SistemasFacade {
    protected SistemaDeAudio audio;

    public void inicializarSubsistemas() {

        audio = new SistemaDeAudio();
        audio.configurarCanais();
        audio.configurarFrequencia();
        audio.configurarVolume();
    }

    public void reproduzirAudio(String arquivo) {
        audio.reproduzirAudio(arquivo);
    }


}
