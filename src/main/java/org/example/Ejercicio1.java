package org.example;

import java.util.Scanner;

public class Ejercicio1 {

//VERSIÓN 3

    static Scanner sc = new Scanner(System.in);

    //Este algoritmo calcula la media de valores (por ejemplo, de las notas), introducidos por el usuario. En primer lugar, el usuario indica el número de valores cuyo promedio desea conocer. Seguidamente, introduce todos estos valores. Finalmente, se muestra la media de estos valores.
     //crear algoritmo que calcula la media de valores introducidos por el usuario
    public static void main(String[] args) {
        //declarar variables
        int valor;
        int suma = 0;
        int media;
        int numeroValores = 0;
        int numeroValoresSuperiores = 0;
        //pedir al usuario que introduzca los valores
        do {
            System.out.println("Introduzca el valor " + (numeroValores + 1) + ": ");
            valor = sc.nextInt();
            if (valor != -1) {
                suma = suma + valor;
                numeroValores++;
                if (valor > 10) {
                    numeroValoresSuperiores++;
                }
            }
        } while (valor != -1);
        //calcular la media
        media = suma / numeroValores;
        //mostrar la media
        System.out.println("La media de los valores introducidos es: " + media);
        //mostrar el porcentaje de notas superiores a 10/20
        System.out.println("El porcentaje de notas superiores a 10/20 es: " + (numeroValoresSuperiores * 100 / numeroValores) + "%");
    }
}
