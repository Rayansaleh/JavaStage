package com.company;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();


        int resultat = 1;

        for(int i = 1; i <= a ; i++){

            resultat *= i;

        }
        System.out.println(resultat);

    }

}
