package com;

public class Main {

    public static void main(String[] args){

        Graphic g = new SimpleGraphic();
        Graphic g2 = new CompositeGraphic();

        g2.add(new SimpleGraphic());
        g2.add(new SimpleGraphic());
        g2.add(new SimpleGraphic());

        g.paint();
        g2.paint();
    }
}
