package com;

public class DeusApolo implements Deus {

    @Override
    public void responderPergunta(String pergunta) {
        System.out.println(pergunta);
        System.out.println("resposta");
    }
}
