package com.mycompany.java_learning;

import java.util.Scanner;

public class Cuarto_Ejercicio {

    public static void main(String[] args) {

        Scanner sp = new Scanner(System.in);
        System.out.println("Ingrese la cantidad en grados centígrados: ");

        double grados = sp.nextInt();
        double fahre = 32+ (9 * grados / 5);
        System.out.println(grados + " grados centigrados equivale a " + fahre + " grados fahrenheit.");

    }

}
