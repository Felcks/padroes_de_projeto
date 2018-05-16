package com;

public interface ProdutoBuilder {

    public void buildNome(String nome);
    public void buildPreco(int preco);

    public Produto gerarProduto();
}
