package com;

public class Texto {

    protected String texto;
    Zelador caretaker;

    public Texto() {
        caretaker = new Zelador();
        texto = new String();
    }

    public void escreverTexto(String novoTexto) {
        caretaker.adicionarMemento(new TextoMemento(texto));
        texto += novoTexto;
    }

    public void desfazerEscrita() {
        texto = caretaker.getUltimoEstadoSalvo().getTextoSalvo();
    }

    public void mostrarTexto() {
        System.out.println(texto);
    }
}
