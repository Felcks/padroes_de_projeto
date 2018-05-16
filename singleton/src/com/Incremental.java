package com;

public class Incremental {

    private Incremental(){
        contador = 0;
    }

    public static Incremental getInstance(){
        if(incremental == null)
            incremental = new Incremental();

        return incremental;
    }

    public void aumentarContador(){
        contador++;
    }

    public int getContador(){
        return contador;
    }

    private static Incremental incremental;
    private int contador = 0;
}
