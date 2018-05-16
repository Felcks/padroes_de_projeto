package com;

public class Calabreza extends Pizza {

        IPizzaIngredientAbstractFactory ingredientFactory;
        public Calabreza(IPizzaIngredientAbstractFactory ingredientFactory) {
            this.ingredientFactory = ingredientFactory;
        }

    @Override
    public void prepare() {
        massa = ingredientFactory.createMassa();
        molho = ingredientFactory.createMolho();
        carne = ingredientFactory.createCarne();
    }
}
