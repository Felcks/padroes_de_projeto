package com;

public class PalioPrototype extends CarroPrototype {

    public PalioPrototype(PalioPrototype palioPrototype){
        this.valorCompra = palioPrototype.getValorCompra();
    }

    public PalioPrototype(){
        valorCompra = 0;
    }

    @Override
    public CarroPrototype clonar() {
        return new PalioPrototype(this);
    }

    @Override
    public String exibirInfo() {
        return "Modelo: Palio\nMontadora: Ford\n" + "Valor: R$" + getValorCompra();
    }
}
