package com;

public class Main {

    public static void main(String[] args){

        AgregadoDeCanais canaisDeEsporte = new CanaisEsporte();
        IteradorInterface iterador = canaisDeEsporte.criarIterator();

        for(;!iterador.isDone(); iterador.next()){
            System.out.println(iterador.currentItem().getNome());
        }
    }
}
