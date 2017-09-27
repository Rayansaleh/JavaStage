package com.company.RacineCarre;

import static java.lang.Math.cos;
import static java.lang.Math.sin;

public class RacineCarre {

    public static void main(String[] args) {
	// write your code here
        float x = 0;
        float x1 = 4;
        float x2 = 12;
        double e = 0.00001;
        float x3 = 1;
        int compteur = 0;

        while(e < x3 ) {


            float fx1 = f(x1);
            float fx2 = f(x2);
            float fx3 = f(x3);

            x3 = (x1 + x2) / 2;

            if(Math.signum(fx1) == Math.signum(fx3)){

                x1 = x3;

            }
            else if(Math.signum(fx2) == Math.signum(fx3)){

                x2 = x3;
            }

            if (Math.signum(fx1) == Math.signum(fx2))
                break;

            compteur++;




            System.out.println("fx1 : " + fx1);
            System.out.println("fx2 : " + fx2);
            System.out.println("fx3 : " + fx3);
            System.out.println("x1 : " + x1);
            System.out.println("x2 : " + x2);
            System.out.println("x3 : " + x3);
        }
        System.out.println(compteur);


    }

    private static float f(float x) {
        return (float) (x*x + 3 * 3.14 *(x * cos(x) + sin(x)));
    }
}
