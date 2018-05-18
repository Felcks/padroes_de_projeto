package com;

import java.util.ArrayList;
import java.util.List;

public class CompositeGraphic implements Graphic {

    private List<Graphic> children = new ArrayList<Graphic>();

    @Override
    public void add(Graphic g) {
        children.add(g);
    }

    @Override
    public void remove(Graphic g) {
        children.remove(g);
    }

    @Override
    public Graphic get(int index) {
        return children.get(index);
    }

    @Override
    public void paint() {
        for(Graphic g : children){
            g.paint();
        }
    }
}
