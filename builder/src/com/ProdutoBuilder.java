package com;

public interface ProdutoBuilder {

    public void buildNome();
    public void buildPreco();

    public Produto gerarProduto();
}
