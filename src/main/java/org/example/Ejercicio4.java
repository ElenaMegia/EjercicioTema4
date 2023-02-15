package org.example;

import java.util.Scanner;

public class Ejercicio4 {
    static Scanner sc = new Scanner(System.in);

    //Su algoritmo debe generar un número entero aleatorio entre 1 y 100. El usuario tiene que encontrar este número. Con cada intento del usuario, se le debe indicar si el número es mayor, menor o igual al valor introducido. El programa finaliza cuando el usuario ha encontrado el número.
    public static void adivinarnumero() {
        //declarar variables
        int numeroAleatorio;
        int numeroUsuario;
        //generar número aleatorio
        numeroAleatorio = (int) (Math.random() * 100 + 1);

        //pedir al usuario que introduzca un número
        System.out.println("Introduzca un número: ");
        numeroUsuario = sc.nextInt();
        //comprobar si el número introducido es igual al número aleatorio
        while (numeroUsuario != numeroAleatorio) {
            //comprobar si el número introducido es mayor que el número aleatorio
            if (numeroUsuario < numeroAleatorio) {
                System.out.println("El número introducido es mayor que el número aleatorio");
            } else {
                System.out.println("El número introducido es menor que el número aleatorio");
            }
            //pedir al usuario que introduzca un número
            System.out.println("Introduzca un número: ");
            numeroUsuario = sc.nextInt();
        }
        //mostrar mensaje de felicitación
        System.out.println("¡Enhorabuena! Has acertado el número");
    }

}
