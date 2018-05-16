package com;

public class PaoProdutoBuilder implements ProdutoBuilder {

    private String nome;
    private int preco;


    @Override
    public void buildNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void buildPreco(int preco) {
        this.preco = preco;
    }

    @Override
    public Produto gerarProduto() {
        return new PaoProduto(nome, preco);
    }
}
