package com;

public interface EmailHandler {

    public void setNext(EmailHandler handler);

    public void handleRequest(Email email);
}
