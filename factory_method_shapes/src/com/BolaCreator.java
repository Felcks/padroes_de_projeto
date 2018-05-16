package com;

public class BolaCreator extends AbstractShapeCreator {

    @Override
    public Shape createShape() {
        return new Bola();
    }
}
