package com;

import java.util.ArrayList;

public class Zelador {

    protected ArrayList<TextoMemento> estados;

    public Zelador() {
        estados = new ArrayList<TextoMemento>();
    }

    public void adicionarMemento(TextoMemento memento) {
        estados.add(memento);
    }

    public TextoMemento getUltimoEstadoSalvo() {
        if (estados.size() <= 0) {
            return new TextoMemento("");
        }
        TextoMemento estadoSalvo = estados.get(estados.size() - 1);
        estados.remove(estados.size() - 1);
        return estadoSalvo;
    }
}
