package com;

public class HotmailHandler implements EmailHandler {

    private EmailHandler next;

    @Override
    public void setNext(EmailHandler handler) {
        next = handler;
    }

    @Override
    public void handleRequest(Email email) {

        if(email.getNome().endsWith("@hotmail.com")){
            System.out.println("Fiz o trabalho  com hotmail!");
        }
        else{
            next.handleRequest(email);
        }
    }
}
