package com;

public class PaoProdutoBuilder implements ProdutoBuilder {

    private String nome;
    private int preco;


    @Override
    public void buildNome() {
        this.nome = "Pão";
    }

    @Override
    public void buildPreco() {
        this.preco = 25;
    }

    @Override
    public Produto gerarProduto() {
        return new PaoProduto(nome, preco);
    }
}
