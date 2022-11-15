package Ejercicios_If_Switch;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner h = new Scanner(System.in);
        int num1, num2, num3;

        System.out.println("Ingrese el Primer número");
        num1 = h.nextInt();
        System.out.println("Ingrese el Segundo número:");
        num2 = h.nextInt();
        System.out.println("Ingrese el Tercer número:");
        num3 = h.nextInt();

        if (num1 >= num2 && num2 >= num3) {
            System.out.println(num1 + " " + num2 + " " + num3);
        } else if (num2 >= num1 && num1 >= num3) {
            System.out.println(num2 + " " + num1 + " " + num3);
        } else if (num3 >= num1 && num1 >= num2) {
            System.out.println(num3 + " " + num1 + " " + num2);
        } else if (num1 >= num3 && num3 >= num2) {
            System.out.println(num1 + " " + num3 + " " + num2);
        } else if (num2 >= num3 && num3 >= num1) {
            System.out.println(num2 + " " + num3 + " " + num1);
        } else {
            System.out.println(num3 + " " + num2 + " " + num1);
        }
    }

}
