package com;

public class Arvore {

    private No raiz;


    public void inserir(int chave) {

        if(raiz == null)
            raiz = new No(chave);
        else
            inserirNo(chave, raiz);

    }

    private void inserirNo(int chave, No no){

        if(chave < no.getChave()){

            if(no.getEsquerdo() == null){
                no.setEsquerdo(new No(chave));
            }
            else{
                inserirNo(chave, no.getEsquerdo());
            }
        }
        else{

            if(no.getDireito() == null){
                no.setDireito(new No(chave));
            }
            else{
                inserirNo(chave, no.getDireito());
            }
        }

    }

    public void visitar(ArvoreVisitor visitor){
        visitor.visitar(raiz);
    }
}
