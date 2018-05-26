package com;

public class Funcionario {

    public double salarioBase;
    public Cargo cargo;

    public Funcionario(Cargo cargo, int salarioBase){

        CalcularImposto estrategia = null;

        this.cargo = cargo;
        this.salarioBase = salarioBase;

        switch (cargo){
            case DESENVOLVEDOR:
                estrategia = new CalculaImpostoQuinzeOuDez(2000);
                break;
            case DBA:
                estrategia = new CalculaImpostoQuinzeOuDez(2000);
                break;
            case GERENTE:
                estrategia = new CalculaImpostoVinteOuQuinze(3500);
        }

        if(estrategia != null){
            this.salarioBase = estrategia.calculaSalarioComImposto(this);
        }
    }
}
