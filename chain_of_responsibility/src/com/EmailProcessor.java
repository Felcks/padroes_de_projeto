package com;

public class EmailProcessor {

    private EmailHandler prevHandler;
    private EmailHandler firstHandler;

    public void addHandler(EmailHandler handler){

        if(prevHandler != null){
            prevHandler.setNext(handler);
        }
        else{
            firstHandler = handler;
        }

        prevHandler = handler;
    }

    public void handleRequest(Email email){

        if(firstHandler != null)
            firstHandler.handleRequest(email);
    }
}
