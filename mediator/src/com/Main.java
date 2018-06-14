package com;

public class Main {

    public static void main(String[] args){

        MensagemMediator mediador = new MensagemMediator();

        AndroidColleague android = new AndroidColleague(mediador);
        IosColleague ios = new IosColleague(mediador);

        mediador.adicionarColleague(android);
        mediador.adicionarColleague(ios);


        android.enviar("Oi Symbian! Eu sou um Android!");
        System.out.println("=========");
        ios.enviar("Olá todos, sou um iOs!");
    }
}
