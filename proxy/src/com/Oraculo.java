package com;

public class Oraculo implements Deus {

    private DeusApolo deusApolo = new DeusApolo();
    private Boolean taxaPaga = false;

    @Override
    public void responderPergunta(String pergunta) {
        if(taxaPaga == false) {
            System.out.println("A Taxa não foi paga.");
            return;
        }

        deusApolo.responderPergunta(pergunta);
    }

    public void pagarTaxa(){
        taxaPaga = true;
    }
}
