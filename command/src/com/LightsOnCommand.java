package com;

public class LightsOnCommand implements Command{

    private Light light;

    public LightsOnCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.switchOn();
    }
}
