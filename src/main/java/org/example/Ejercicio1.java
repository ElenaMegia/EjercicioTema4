package org.example;

import java.util.Scanner;

public class Ejercicio1 {
//VERSION 2
    
    static Scanner sc = new Scanner(System.in);
// El objetivo sigue siendo realizar el cálculo de la media de un conjunto de valores introducidos por el usuario, pero el usuario ya no tiene que indicar inicialmente el número de valores. Introduce los valores y cuando ha terminado, introduce un valor concreto (-1), para indicar que ha terminado de introducir valores.
    public static void main(String[] args) {
        //declarar variables
        int valor;
        int suma = 0;
        int media;
        int numeroValores = 0;
        //pedir al usuario que introduzca los valores
        do {
            System.out.println("Introduzca el valor " + (numeroValores + 1) + ": ");
            valor = sc.nextInt();
            if (valor != -1) {
                suma = suma + valor;
                numeroValores++;
            }
        } while (valor != -1);
        //calcular la media
        media = suma / numeroValores;
        //mostrar la media
        System.out.println("La media de los valores introducidos es: " + media);
    }


}
