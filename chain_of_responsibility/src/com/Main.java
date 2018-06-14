package com;

public class Main {

    public static void main(String[] args){

        EmailProcessor processor = new EmailProcessor();
        processor.addHandler(new GmailHandler());
        processor.addHandler(new HotmailHandler());

        processor.handleRequest(new Email("aaaa@hotmail.com"));
    }
}
