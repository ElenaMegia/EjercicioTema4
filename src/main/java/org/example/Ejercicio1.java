package org.example;

import java.util.Scanner;

public class Ejercicio1 {
    static Scanner sc = new Scanner(System.in);

    //Este algoritmo calcula la media de valores (por ejemplo, de las notas), introducidos por el usuario. En primer lugar, el usuario indica el número de valores cuyo promedio desea conocer. Seguidamente, introduce todos estos valores. Finalmente, se muestra la media de estos valores.
     //crear algoritmo que calcula la media de valores introducidos por el usuario
    public static void Media() {
        //declarar variables
        int numeroValores;
        int valor;
        int suma = 0;
        int media;
        //pedir al usuario que introduzca el número de valores
        System.out.println("Introduzca el número de valores: ");
        numeroValores = sc.nextInt();
        //pedir al usuario que introduzca los valores
        for (int i = 1; i <= numeroValores; i++) {
            System.out.println("Introduzca el valor " + i + ": ");
            valor = sc.nextInt();
            suma = suma + valor;
        }
        //calcular la media
        media = suma / numeroValores;
        //mostrar la media
        System.out.println("La media de los valores introducidos es: " + media);
    }
}
