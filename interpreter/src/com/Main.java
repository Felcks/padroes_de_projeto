package com;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args){
        ArrayList<NumeroRomanoInterpreter> interpretadores = new ArrayList<NumeroRomanoInterpreter>();
        interpretadores.add(new DoisDigitosRomanos());
        interpretadores.add(new UmDigitoRomano());

        String numeroRomano = "XLIV";
        Contexto contexto = new Contexto(numeroRomano);

        for (NumeroRomanoInterpreter numeroRomanoInterpreter : interpretadores) {
            numeroRomanoInterpreter.interpretar(contexto);
        }

        System.out.println(numeroRomano + " = "
                + Integer.toString(contexto.getOutput()));
    }
}
