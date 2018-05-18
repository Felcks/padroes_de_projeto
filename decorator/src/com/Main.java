package com;

public class Main {

    public static void main(String[] args){

        Acai acai = new AcaiBase();
        //acai.mostrarComplementos();

        acai = new AcaiComGranola(acai);
        acai = new AcaiComGranola(acai);
        acai.mostrarComplementos();
    }
}
