package org.example;

import java.util.Scanner;

public class Ejercicio6 {
    //Este algoritmo pide al usuario que introduzca la capital de Francia. Si el usuario introduce la respuesta correcta, el programa finaliza. Si el usuario introduce la respuesta incorrecta, se le indica que la respuesta es incorrecta y se le pide que vuelva a intentarlo. El programa finaliza cuando el usuario ha introducido la respuesta correcta o cuando ha agotado el número máximo de intentos que son 5.

    //crear algoritmo que pide al usuario que introduzca la capital de Francia

    //Crea una constante que se llame MAX_INTENTOS y que tenga el valor 5
    static final int MAX_INTENTOS = 5;
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        //declarar variables
        String capitalFrancia;
        String valorIntroducido;
        int numIntento = 1;

        //pedir al usuario que introduzca la capital de Francia
        System.out.println("Introduzca la capital de Francia: ");
        capitalFrancia = sc.nextLine();
        //comprobar si la valorIntroducido es correcta
        while (!capitalFrancia.equalsIgnoreCase("paris") && numIntento < MAX_INTENTOS) {
            //mostrar mensaje de error
            System.out.println("Respuesta incorrecta");
            System.out.println("Solo queda(n) " + (MAX_INTENTOS - numIntento) + " intento(s)");
            //pedir al usuario que introduzca la capital de Francia
            System.out.println("Introduzca la capital de Francia: ");
            capitalFrancia = sc.nextLine();
            //incrementar el numIntento
            numIntento++;
        }
        //comprobar si el numIntento es menor que 5
        if (numIntento < MAX_INTENTOS) {
            //mostrar mensaje de felicitación
            System.out.println("¡Enhorabuena! Has acertado el valor introducido");
        } else {
            //mostrar mensaje de error
            System.out.println("Has agotado el número máximo de intentos");
        }
    }

}