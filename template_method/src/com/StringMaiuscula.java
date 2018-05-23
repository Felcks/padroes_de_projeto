package com;

public class StringMaiuscula extends StringTemplate {

    @Override
    public String transform(String str) {
        return str.toUpperCase();
    }
}
