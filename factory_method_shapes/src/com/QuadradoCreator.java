package com;

public class QuadradoCreator extends AbstractShapeCreator {

    @Override
    public Shape createShape() {
        return new Quadrado();
    }
}
