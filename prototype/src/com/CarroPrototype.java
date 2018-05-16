package com;

public abstract class CarroPrototype {

    protected double valorCompra;

    public abstract CarroPrototype clonar();

    public abstract String exibirInfo();

    public double getValorCompra(){
        return valorCompra;
    }

    public void setValorCompra(double valorCompra){
        this.valorCompra = valorCompra;
    }
}
