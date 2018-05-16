package com;

public interface IPizzaIngredientAbstractFactory {

    public Massa createMassa();
    public Molho createMolho();
    public Carne createCarne();
}
