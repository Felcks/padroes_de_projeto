package com;

public class StringMinuscula extends StringTemplate {

    @Override
    public String transform(String str) {
        return str.toLowerCase();
    }
}
