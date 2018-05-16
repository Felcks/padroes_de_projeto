package com;

public abstract class AbstractShapeCreator {

    public abstract Shape createShape();

    public Shape getShape(){

        Shape shape = createShape();

        return shape;
    }
}
