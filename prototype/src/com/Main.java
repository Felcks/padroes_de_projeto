package com;

public class Main {

    public static void main(String[] args){

        CarroPrototype palioPrototype = new PalioPrototype();
        palioPrototype.setValorCompra(100);

        CarroPrototype fiestaPrototype = new FiestaPrototype();
        fiestaPrototype.setValorCompra(200);

        CarroPrototype palioUsado = palioPrototype.clonar();
        palioUsado.setValorCompra(50);

        CarroPrototype palioNovo = palioPrototype.clonar();
        palioNovo.setValorCompra(100);

        System.out.println(palioNovo.exibirInfo());
        System.out.print(palioUsado.exibirInfo());
    }
}
