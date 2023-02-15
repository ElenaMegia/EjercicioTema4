package org.example;

import java.util.Scanner;

public class Ejercicio9 {
    static Scanner sc = new Scanner(System.in);

    public static void Multiplo() {
        //declarar variables
        int numeroUsuario;
        //pedir al usuario que introduzca un número
        System.out.println("Escriba un múltiplo de 3");
        numeroUsuario = sc.nextInt();
        //comprobar si el número introducido es igual al número aleatorio
        while (numeroUsuario % 3 != 0) {
            //pedir al usuario que introduzca un número
            System.out.println("Error " + numeroUsuario + " no es un múltiplo de 3");
            System.out.println("Escriba un múltiplo de 3");
            numeroUsuario = sc.nextInt();
        }
        //mostrar mensaje de felicitación
        System.out.println("Ok: " + numeroUsuario + " es un múltiplo de 3");
    }
}
