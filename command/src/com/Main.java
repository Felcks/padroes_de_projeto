package com;

public class Main {

    public static void main(String[] args){

        RemoteControl remoteControl = new RemoteControl();

        Light light = new Light();
        light.printStatus();

        Command lightsOnCommand = new LightsOnCommand(light);

        remoteControl.setCommand(lightsOnCommand);
        remoteControl.pressButton();

        light.printStatus();
    }
}
