package com.company;

import java.util.ArrayList;

public class Pascal {

    public static void main(String[] args) {
	// write your code here
        int M = 5;
        int p = 0;
        int n = 0;
        int C = 0;
        int w = 0;
        int compteur = 0;
        int resultatn;
        int resultatp;
        int resultatnp;
        ArrayList al = new ArrayList();

        while(n <= M){
            p = 0;
            while(p <= n){
                resultatn = 1;
                resultatp = 1;
                resultatnp = 1;

                for (int i = 1; i <= n; i++){
                    resultatn *= i;
                }
                for (int j = 1; j <= p; j++){
                    resultatp *= j;
                }
                for (int k = 1; k <= (n-p); k++){
                    resultatnp *= k;
                }

                C = resultatn / (resultatp * resultatnp);

                al.add(C);
                p++;
            }
            n++;
        }
      System.out.println(al);
        }
    }


