package com;

public class GmailHandler implements EmailHandler {

    private EmailHandler next;

    @Override
    public void setNext(EmailHandler handler) {
        next = handler;
    }

    @Override
    public void handleRequest(Email email) {

        if(email.getNome().endsWith("@gmail.com")){
            System.out.println("Fiz o trabalho  com gmail!");
        }
        else{
            next.handleRequest(email);
        }
    }
}
