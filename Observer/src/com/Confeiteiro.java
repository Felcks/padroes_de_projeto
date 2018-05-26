package com;

import java.util.ArrayList;

public class Confeiteiro {

    private ArrayList<BoloObserver> observers;
    private int contador = 0;

    public Confeiteiro(){
        this.observers = new ArrayList<BoloObserver>();

        Thread thread = null;
        thread = new Thread(new Runnable() {
            @Override
            public void run() {
                while(true) {

                    tempoPassando();
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new IllegalStateException(e);
                    }
                }
            }
        });
        thread.start();
    }

    public void entrarNaEspera(BoloObserver observer){
        this.observers.add(observer);
    }

    public void sairDaEspera(int index){
        observers.remove(index);
    }

    private void boloEstaPronto(){
        for(BoloObserver observer : observers)
            observer.boloPronto();
    }

    private void tempoPassando(){
        this.contador++;
        System.out.println("Tempo no forno:" + contador);

        if(contador == 10){
            this.boloEstaPronto();
        }
    }
}
