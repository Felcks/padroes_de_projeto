package com;

public class CalculaImpostoQuinzeOuDez implements CalcularImposto {

    private int salarioReferencia;
    public CalculaImpostoQuinzeOuDez(int salarioReferencia){
        this.salarioReferencia = salarioReferencia;
    }

    @Override
    public double calculaSalarioComImposto(Funcionario funcionario) {
        if(funcionario.salarioBase > this.salarioReferencia){
            return funcionario.salarioBase * 0.85;
        }
        else
            return funcionario.salarioBase * 0.9;
    }
}
