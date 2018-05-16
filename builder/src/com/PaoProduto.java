package com;

public class PaoProduto implements Produto {

    private String nome = "pao";
    private int preco;


    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public int getPreco() {
        return preco;
    }

    public PaoProduto(String nome, int preco){
        this.nome = nome;
        this.preco = preco;
    }
}
