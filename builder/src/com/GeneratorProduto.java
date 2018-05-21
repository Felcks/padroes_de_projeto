package com;

public class GeneratorProduto {

    private ProdutoBuilder produtoBuilder;

    public GeneratorProduto(ProdutoBuilder produtoBuilder){
        this.produtoBuilder = produtoBuilder;
    }

    public Produto geraProduto(){

        this.produtoBuilder.buildNome();
        this.produtoBuilder.buildPreco();
        return produtoBuilder.gerarProduto();
    }
}
