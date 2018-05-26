package com;

public abstract class NumeroRomanoInterpreter {

    protected abstract String um();
    protected abstract String quatro();
    protected abstract String cinco();
    protected abstract String nove();
    protected abstract int multiplicador();

    public void interpretar(Contexto contexto){

        if(contexto.getInput().length() == 0)
            return;


        if(contexto.getInput().startsWith(nove())){
            consumirDoisDigito(contexto);
            adicionar(9, contexto);
        }
        else if(contexto.getInput().startsWith(quatro())){
            consumirDoisDigito(contexto);
            adicionar(4, contexto);
        }
        else if(contexto.getInput().startsWith(cinco())){
            consumirUmDigito(contexto);
            adicionar(5, contexto);
        }

        while(contexto.getInput().startsWith(um())){
            consumirUmDigito(contexto);
            adicionar(1, contexto);
        }
    }

    private void consumirUmDigito(Contexto contexto){
        contexto.setInput(contexto.getInput().substring(1));
    }

    private void consumirDoisDigito(Contexto contexto){
        contexto.setInput(contexto.getInput().substring(2));
    }

    private void adicionar(int numero, Contexto contexto){
        contexto.setOutput(contexto.getOutput() + (numero * multiplicador()));
    }
}
