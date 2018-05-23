package com;

import java.util.Comparator;

public class ComparatorId implements Comparator<Aluno> {

    @Override
    public int compare(Aluno o1, Aluno o2) {
        return o1.id - o2.id;
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }
}
