package com;

public class Main {

    public static void main(String[] args){

        IPizzaIngredientAbstractFactory factory = new PizzaIngredientFactory();
        Pizza pizza = new Calabreza(factory);

        pizza.prepare();
        pizza.printarIngredientes();
    }
}
