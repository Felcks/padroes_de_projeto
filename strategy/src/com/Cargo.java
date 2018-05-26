package com;

public enum Cargo {

    DESENVOLVEDOR(0), DBA(1), GERENTE(2);

    int index;

    private Cargo(int index){
        this.index = index;
    }
}
