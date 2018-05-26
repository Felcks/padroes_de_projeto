package com;

public class No {

    private No direito;
    private No esquerdo;
    private int chave;

    public No(int chave){
        this.chave = chave;
        direito = null;
        esquerdo = null;
    }

    public No getDireito() {
        return direito;
    }

    public void setDireito(No direito) {
        this.direito = direito;
    }

    public No getEsquerdo() {
        return esquerdo;
    }

    public void setEsquerdo(No esquerdo) {
        this.esquerdo = esquerdo;
    }

    public int getChave() {
        return chave;
    }
}
