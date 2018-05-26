package com;

public class Main {

    public static void main(String[] args){
        Confeiteiro confeiteiro = new Confeiteiro();

        Pessoa pessoa = new Pessoa();
        confeiteiro.entrarNaEspera(pessoa);

        Rei rei = new Rei();
        confeiteiro.entrarNaEspera(rei);
    }
}
