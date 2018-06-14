package com;

public abstract class Colleague {

    private Mediator mediator;

    public Colleague(Mediator mediator){
        this.mediator = mediator;
    }

    public void enviar(String mensagem){
        this.mediator.enviar(mensagem, this);
    }

    public abstract void receber(String mensagem);
}
