package com.company;

import java.util.stream.IntStream;

public class formuleSomme {

    public int CalculSomme() {


        int Somme = IntStream.iterate(0, i -> i + 1).limit(101).sum();

        return Somme;

    }
}
