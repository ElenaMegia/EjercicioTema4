package org.example;

import java.io.IOException;

public class Ejercicio5 {
    static java.util.Scanner sc = new java.util.Scanner(System.in);
    public static void NumeroAleatorio() throws IOException {
        int numeroAleatorio;
        int contador = 0;
        char respuesta;

        //pedir al usuario que introduzca un número
        System.out.println("Elija un número del 1 al 100, luego presione cualquier tecla.");
        char letra = sc.next().charAt(0);
        numeroAleatorio = (int) (Math.random() * 100 + 1);
        int pequeño=100;
        int grande=0;
        do {
            contador++;
            //pedir al usuario que introduzca un número
            System.out.println("Pruebo con " + numeroAleatorio + ", ¿es mayor, menor o es el número (+/-/=)?");
            //leer la respuesta del usuario
            respuesta = sc.next().charAt(0);
            //comprobar si el número introducido es mayor que el número aleatorio
            if (respuesta == '-') {
               pequeño=numeroAleatorio;


            } else if (respuesta == '+') {
                grande=numeroAleatorio;
               // numeroAleatorio = (int) (Math.random() * (100 - numeroAleatorio) + numeroAleatorio + 1);
            }
            //crear numero aleatorio donde el maximo sea la variable pequeño y el minimo la variable grande
            numeroAleatorio = (int) (Math.random() * (pequeño - grande) + grande + 1);
        } while (respuesta != '=');
        //mostrar mensaje de felicitación
        System.out.println("¡Fenomenal, lo he encontrado después de " + contador + " intentos!");
    }

}
