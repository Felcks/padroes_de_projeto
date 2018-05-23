package com;

public class Sprite extends SpriteFlyweight {

    public Imagem imagem;

    public Sprite(String nome){
        this.imagem = new Imagem(nome);
    }

    @Override
    public void desenharImagem(Ponto ponto) {
        imagem.desenharImagem();
        System.out.println("no ponto: " + ponto.x + "  y: " + ponto.y);
    }
}
