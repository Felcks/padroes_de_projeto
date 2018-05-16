package com;

public class Main {

    public static void main(String[] args){

        AbstractShapeCreator creator = new QuadradoCreator();
        Shape shape = creator.createShape();
        shape.desenhar();
    }
}
