package Ejercicios_If_Switch;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner sp = new Scanner(System.in);

        System.out.println("Ingrese su dia");
        int dia = sp.nextInt();

        System.out.println("Ingrese su mes");
        int mes = sp.nextInt();

        System.out.println("Ingrese su año");

        int año = sp.nextInt();

        switch (mes) {
            case 1:
                if (dia <= 31) {
                    if (año > 0) {
                        System.out.println("Fecha correcta");
                    }
                } else {
                    System.out.println("Dia incorrecto");
                }
                break;

            case 2:
                if (dia < 28) {
                    if (año > 0) {
                        System.out.println("Fecha correcta");
                    }
                } else {
                    System.out.println("Dia incorrecto");
                }

                break;

            case 3:
                if (dia <= 31) {
                    if (año > 0) {
                        System.out.println("Fecha correcta");
                    }
                } else {
                    System.out.println("Dia incorrecto");
                }
                break;

            case 4:
                if (dia <= 30) {
                    if (año > 0) {
                        System.out.println("Fecha correcta");
                    } else {
                        System.out.println("Dia incorrecto");
                    }
                }
                break;
            case 5:
                if (dia <= 31) {
                    if (año > 0) {
                        System.out.println("Fecha correcta");
                    } else {
                        System.out.println("Dia incorrecto");
                    }
                }
                break;

            case 6:
                if (dia <= 30) {
                    if (año > 0) {
                        System.out.println("Fecha correcta");
                    } else {
                        System.out.println("Dia incorrecto");
                    }
                }
                break;
            case 7:
                if (dia <= 31) {
                    if (año > 0) {
                        System.out.println("Fecha correcta");
                    } else {
                        System.out.println("Dia incorrecto");
                    }
                }
                break;

            case 8:
                if (dia <= 31) {
                    if (año > 0) {
                        System.out.println("Fecha correcta");
                    }
                } else {
                    System.out.println("Dia incorrecto");
                }
                break;
            case 9:
                if (dia <= 30) {
                    if (año > 0) {
                        System.out.println("Fecha correcta");
                    }
                } else {
                    System.out.println("Dia incorrecto");
                }
                break;

            case 10:
                if (dia <= 31) {
                    if (año > 0) {
                        System.out.println("Fecha correcta");
                    }
                } else {
                    System.out.println("Dia incorrecto");
                }
                break;
            case 11:
                if (dia <= 30) {
                    if (año > 0) {
                        System.out.println("Fecha correcta");
                    }
                } else {
                    System.out.println("Dia incorrecto");
                }
                break;

            case 12:
                if (dia <= 31) {
                    if (año > 0) {
                        System.out.println("Fecha correcta");
                    }
                } else {
                    System.out.println("Dia incorrecto");
                }
                break;

            default:
                System.out.println("Mes Incorrecto");
        }

    }
}
