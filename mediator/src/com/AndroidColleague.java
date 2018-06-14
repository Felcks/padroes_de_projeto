package com;

public class AndroidColleague extends Colleague {

    public AndroidColleague(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void receber(String mensagem) {
        System.out.println("Recebi mensagem do Android: " + mensagem);
    }
}
