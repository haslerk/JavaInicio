package Ejercicios_If_Switch;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner h = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        int num = h.nextInt();

        if (num >= 0) {
            System.out.println("El numero es positivo.");
        } else {
            System.out.println("Es múmero negativo.");
        }
    }

}
