package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        double a, b, f, x, u;
        Scanner s=new Scanner(System.in);


        System.out.print("Vvedite interval [a,b]");
        a= s.nextInt();
        b= s.nextInt();

        System.out.print("Vvedite x");
        x= s.nextInt();

        System.out.print("Vvedite u");
        u= s.nextInt();


        if (x < a) {

            f = Math.pow(x, 4) * Math.sin(x);
        }
        else
            if (x > a || x < b) {

              f = x * Math.abs(x + u);
        }
        else {

            f = x - 1 + 1 / (x - 1);
        }
        System.out.println(f);

    }
}
