package com;

public class VisitorInOrder implements ArvoreVisitor{

    @Override
    public void visitar(No no) {

        if(no == null)
            return;

        visitar(no.getEsquerdo());
        System.out.println(no.getChave());
        visitar(no.getDireito());
    }
}
