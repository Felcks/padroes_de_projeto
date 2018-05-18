package com;

public class AcaiDecorator implements Acai {

    public Acai acai;

    public AcaiDecorator(Acai acai){
        this.acai = acai;
    }

    @Override
    public void mostrarComplementos() {
        this.acai.mostrarComplementos();
    }
}
