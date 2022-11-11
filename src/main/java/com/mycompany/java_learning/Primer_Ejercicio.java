package com.mycompany.java_learning;

import java.util.Scanner;

public class Primer_Ejercicio {

    public static void main(String[] args) {

        Scanner sp = new Scanner(System.in);
        System.out.println("Ingresa un numero");
        int num1 = sp.nextInt();
        System.out.println("Ingresa otro numero");
        int num2 = sp.nextInt();
        System.out.println("Los numeros ingresados son " + num1 + " y " + num2);
    }
}
