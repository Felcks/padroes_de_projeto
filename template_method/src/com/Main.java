package com;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {

    public static void main(String[] args){

        /*String mensagem = "Abelha";
        StringTemplate maiuscula = new StringMaiuscula();
        StringTemplate minuscula = new StringMinuscula();

        System.out.println(maiuscula.transform(mensagem));
        System.out.println(minuscula.transform(mensagem));*/

        ArrayList<Aluno> alunos = new ArrayList<>();
        alunos.add(new Aluno(2, "Igor"));
        alunos.add(new Aluno(1, "Alex"));
        alunos.sort(new Comparator<Aluno>() {
            @Override
            public int compare(Aluno o1, Aluno o2) {
                return o1.nome.compareTo(o2.nome);
            }
        });

        for(Aluno aluno : alunos){
            System.out.println(aluno.nome);
        }
    }
}
