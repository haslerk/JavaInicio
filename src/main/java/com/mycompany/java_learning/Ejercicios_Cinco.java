package com.mycompany.java_learning;

import java.util.Scanner;

public class Ejercicios_Cinco {

    public static void main(String[] args) {

        Scanner sp = new Scanner(System.in);
        final double pi = 3.1415926536;

        System.out.println("Ingrese el valor del radio: ");
        double radio = sp.nextDouble();

        double lc = 2 * pi * radio;
        double ac = pi * radio * radio;

        System.out.println("La Longitud de la Circunferencia de " + radio + " es: " + lc);

        System.out.println("El Area de la Circunferencia de " + radio + " es: " + ac);

    }
}
