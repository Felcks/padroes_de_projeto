package com;

public class PizzaIngredientFactory implements IPizzaIngredientAbstractFactory {
    @Override
    public Massa createMassa() {
        return new Massa();
    }

    @Override
    public Molho createMolho() {
        return new Molho();
    }

    @Override
    public Carne createCarne() {
        return new Carne();
    }
}
