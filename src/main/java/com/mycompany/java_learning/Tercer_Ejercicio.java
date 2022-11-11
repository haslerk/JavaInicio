package com.mycompany.java_learning;

import java.util.Scanner;

public class Tercer_Ejercicio {

    public static void main(String[] args) {

        Scanner sp = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int numero = sp.nextInt();
        int numd = numero * 2;
        int numt = numero * 3;

        System.out.println("El numero ingresado por el doble es: " + numd);
        System.out.println("El numero ingresado por el triple es: " + numt);
    }
}
