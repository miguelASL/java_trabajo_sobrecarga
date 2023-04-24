package org.msarmiento.poosobrecarga;

import static org.msarmiento.poosobrecarga.Calculadora.*;

public class EjemploSobrecarga {

    public static void main(String[] args) {

        System.out.println("sumar int: " + sumar(10, 5));
        System.out.println("sumar float: " + sumar(10f, 5f));
        System.out.println("sumar float - int: " + sumar(10f, 5));
        System.out.println("sumar int - float: " + sumar(10, 5f));
        System.out.println("Sumar double: " + sumar(10d, 5d));
        System.out.println("Sumar String: " + sumar("10", "5"));
        System.out.println("Sumar 3 int: " + sumar(10, 5, 3));
        System.out.println("Sumar 4 int: " + sumar(10, 5, 3, 4, 2));

        System.out.println("Sumar long: " + sumar( 10l, 5l));
    }
}
