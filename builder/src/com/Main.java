package com;

public class Main {

    public static void main(String[] args){

        ProdutoBuilder produtoBuilder = new PaoProdutoBuilder();
        GeneratorProduto generatorProduto = new GeneratorProduto(produtoBuilder);
        Produto produto = generatorProduto.geraProduto();

        System.out.println(produto.getNome());
    }
}
