package Ejercicios_If_Switch;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner sp = new Scanner(System.in);

        System.out.println("Ingrese el primer número: ");
        int num1 = sp.nextInt();
        System.out.println("Ingrese el segundo número: ");
        int num2 = sp.nextInt();
               

        if (num1 == num2) {
            System.out.println("Los numeros son iguales");
        } else {
            System.out.println("Los numeros no son iguales");
        }
    }
}
