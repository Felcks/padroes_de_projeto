package com;

public class FiestaPrototype extends CarroPrototype {

    public FiestaPrototype(FiestaPrototype fiestaPrototype){
        this.valorCompra = fiestaPrototype.getValorCompra();
    }

    public FiestaPrototype(){
        valorCompra = 0;
    }

    @Override
    public CarroPrototype clonar() {
        return new FiestaPrototype(this);
    }

    @Override
    public String exibirInfo() {
        return "Modelo: Fiesta\nMontadora: Ford\n" + "Valor: R$" + getValorCompra();
    }
}
