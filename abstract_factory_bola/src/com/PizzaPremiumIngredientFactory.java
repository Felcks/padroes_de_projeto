package com;

public class PizzaPremiumIngredientFactory implements IPizzaIngredientAbstractFactory {

    @Override
    public Massa createMassa() {
        return new MassaPremium();
    }

    @Override
    public Molho createMolho() {
        return new MolhoPremium();
    }

    @Override
    public Carne createCarne() {
        return new CarnePremium();
    }
}
