package Ejercicios_If_Switch;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner h = new Scanner(System.in);

        System.out.println("Ingrese el primer numero: ");
        int num1 = h.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int num2 = h.nextInt();

        if (num1 > num2) {
            System.out.println(+num1 + " " + num2);
        } else {
            System.out.println(+num2 + " " + num1);
        }
    }
}
