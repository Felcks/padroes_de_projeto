package com;

public class RemoteControl {

    private Command command;
    public void setCommand(Command c){
        this.command = c;
    }

    public void pressButton(){
        if(command != null)
            command.execute();
    }
}
