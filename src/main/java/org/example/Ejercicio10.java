package org.example;

import java.util.Scanner;

public class Ejercicio10 {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        //declarar variables
        int anchura;
        int altura;
        char caracter;
        //pedir al usuario que introduzca un número
        System.out.println("¿Anchura?");
        anchura = sc.nextInt();
        //pedir al usuario que introduzca un número
        System.out.println("¿Altura?");
        altura = sc.nextInt();
        //pedir al usuario que introduzca un número
        System.out.println("¿Carácter?");
        caracter = sc.next().charAt(0);
        //mostrar mensaje de felicitación
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < anchura; j++) {
                System.out.print(caracter);
            }
            System.out.println();
        }
    }


}
