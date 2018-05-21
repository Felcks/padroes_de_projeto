package com;

public abstract class Pizza {

    protected Massa massa;
    protected Molho molho;
    protected Carne carne;

    public abstract void prepare();

    public void printarIngredientes(){

        if(massa instanceof MassaPremium)
            System.out.println("massa premium bb");
        else if(massa instanceof Massa)
            System.out.println("massa normal");
    }
}
