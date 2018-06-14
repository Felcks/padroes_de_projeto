package com;

public class IosColleague extends Colleague {


    public IosColleague(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void receber(String mensagem) {
        System.out.println("Recebi mensagem do IOS: " + mensagem);
    }
}
