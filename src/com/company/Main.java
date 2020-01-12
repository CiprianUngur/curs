package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello");
       System.out.println("Ciprian");

       int x = 52;
       double y = 48;
       double sum = x + y;
        double impartire = x/y;
       System.out.println("Suma adunarii lui x si a lui y este " + sum);
        System.out.println("Rezultatul impartirii lui x la y este " + impartire);


        double a = -5;
        double b = 8;
        double c = 6;
        double rezultat2 = a + b * c;
        System.out.println("Rezultatul operatiei -5 + 8 * 6 este "+ rezultat2);

        double d = 55;
        double e = 9;
        double rezultat3 = d + e;
        double rezultat4 = rezultat3%e;
        System.out.println("Rezultatul operatiei (55+9) % 9 este " +rezultat4);

        double f = 20;
        double g = -3;
        double h = 5;
        double rezultat5 = f + g * h / b;
        System.out.println("Rezultatul operatiei 20 + -3*5 / 8 este " + rezultat5);

        double i = 15;
        double j = 3;
        double k = 2;
        double rezultat6 = (h + ((i / j) * k)) - (b % j);
        System.out.println("Rezultatul operatiei 5 + 15 / 3 * 2 - 8 % 3 este " + rezultat6);

    }
}
