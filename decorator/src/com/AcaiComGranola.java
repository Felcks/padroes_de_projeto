package com;

public class AcaiComGranola extends AcaiDecorator {

    public AcaiComGranola(Acai acai) {
        super(acai);
    }

    @Override
    public void mostrarComplementos() {
        super.mostrarComplementos();
        System.out.println("acai tem granola");

    }
}
