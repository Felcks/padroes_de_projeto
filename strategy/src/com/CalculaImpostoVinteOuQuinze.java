package com;

public class CalculaImpostoVinteOuQuinze implements CalcularImposto {

    private int salarioReferencia;
    public CalculaImpostoVinteOuQuinze(int salarioReferencia){
        this.salarioReferencia = salarioReferencia;
    }

    @Override
    public double calculaSalarioComImposto(Funcionario funcionario) {
        if(funcionario.salarioBase > this.salarioReferencia){
            return funcionario.salarioBase * 0.80;
        }
        else
            return funcionario.salarioBase * 0.85;
    }
}
