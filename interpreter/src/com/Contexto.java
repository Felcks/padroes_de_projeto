package com;

public class Contexto {

    private int output;
    private String input;

    public Contexto(String in){
        this.input = in;
    }

    public String getInput(){
        return this.input;
    }

    public void setInput(String input){
        this.input = input;
    }

    public int getOutput(){
        return this.output;
    }

    public void setOutput(int newOutput){
        this.output = newOutput;
    }
}
