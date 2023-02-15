package org.example;


import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import static org.example.Ejercicio1.Media;
import static org.example.Ejercicio10.Figuras;
import static org.example.Ejercicio4.adivinarnumero;
import static org.example.Ejercicio5.NumeroAleatorio;
import static org.example.Ejercicio6.Capitales;
import static org.example.Ejercicio7.Ejercicio7menu;
import static org.example.Ejercicio9.Multiplo;


public class Menu {
    static Scanner keyboard = new Scanner(System.in);


    public static void switchOptions() throws InputMismatchException {
        boolean repeat=false;
        do {
            try {

                repeat=false;

                System.out.println("\nMenu:\n"
                        + "1º Ejercicio 1, calcular la media .\n"
                        + "2º Ejercicio 4, Adivina el número.\n"
                        + "3º Ejercicio 5, Ahora tengo que encontrarlo yo.\n"
                        + "4º Ejercicio 6, ¿Qué hace este algoritmo?.\n"
                        + "5º Ejercicio 7, Visualización de citas de películas.\n"
                        + "6º Ejercicio 9, Escribir un múltiplo de tres.\n"
                        + "7º Ejercicio 10, Arte ASCII 1.\n"
                        + "0º Salir\n"
                        + "Porfavor escriba la opción deseada: ");

                int choice = keyboard.nextInt();
                if (choice <0||choice>7)
                    throw new OutofRangeException("Error. Tienes que introducir un número entre 0 y 7"); //Excepcion introducida para comprobar que los valores esten entre 0 y 5
                Menu(choice);
            } catch (OutofRangeException exc2) {
                System.out.println(exc2.getMessage());
                repeat=true;
            } catch (InputMismatchException exc3) {
                keyboard.nextLine();
                System.out.println("Error. Tienes que introducir un número."); //Excepcion introducida para comprobar que el valor introducido sea un numero, si no se volvera a pedir un valor
                repeat=true;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }while(repeat);
    }

    public static void Menu(int option) throws IOException { //Metodo donde se llaman a las funciones elegidas en el menu

        switch (option) {
            case 1:
                Media();
                switchOptions ();
                break;
            case 2:
                adivinarnumero();
                switchOptions ();
                break;
            case 3:
                NumeroAleatorio();
                switchOptions ();
                break;
            case 4:
                Capitales();
                switchOptions ();
                break;
            case 5:
                 Ejercicio7menu();
                switchOptions ();
                break;
            case 6:
                Multiplo();
                switchOptions ();
                break;
            case 7:
                Figuras();
                switchOptions ();
                break;
            case 0:
                exit(); //Salida del programa
                break;
        }
    }
    public static void exit() { //Metodo para salir del programa
        System.out.println("Gracias por usar nuestro programa. ¡Hasta pronto!");
    }
}