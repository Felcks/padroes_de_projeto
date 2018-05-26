package com;

public class Main {

    public static void main(String[] args){

        Funcionario funcionario = new Funcionario(Cargo.DESENVOLVEDOR, 1000);
        System.out.println(funcionario.salarioBase);
    }
}
