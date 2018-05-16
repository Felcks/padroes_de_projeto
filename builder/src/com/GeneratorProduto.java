package com;

public class GeneratorProduto {

    private ProdutoBuilder produtoBuilder;

    public GeneratorProduto(ProdutoBuilder produtoBuilder){
        this.produtoBuilder = produtoBuilder;
    }

    public Produto geraProduto(){

        this.produtoBuilder.buildNome("uaehfuhafuhaefuhafeuh");
        this.produtoBuilder.buildPreco(10);
        return produtoBuilder.gerarProduto();
    }
}
