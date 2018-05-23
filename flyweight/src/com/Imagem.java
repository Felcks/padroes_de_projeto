package com;

public class Imagem {

    protected String nome;

    public Imagem(String nome){
        this.nome = nome;
    }

    public void desenharImagem(){
        System.out.println(nome + " desenhada!");
    }

}
