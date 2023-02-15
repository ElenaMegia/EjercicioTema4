package org.example;

import java.util.Scanner;

public class Ejercicio7 {


    static Scanner sc = new Scanner(System.in);

    public static void Ejercicio7menu() {
        //declarar variables
        int opcion;
        //mostrar menú
        System.out.println("1 - Una cita de la ciudad del miedo");
        System.out.println("2 - Una cita de James Bond");
        System.out.println("3 - Una cita de la vida es un largo río tranquilo");
        System.out.println("4 - Una cita de Star Wars");
        System.out.println("5 - Salir de esta magnífica aplicación");
        //pedir al usuario que introduzca una opción
        System.out.println("Introduzca una opción: ");
        opcion = sc.nextInt();
        //comprobar si el usuario ha elegido una opción válida
        while (opcion < 1 || opcion > 5) {
            System.out.println("La opción introducida no es válida");
            //pedir al usuario que introduzca una opción
            System.out.println("Introduzca una opción: ");
            opcion = sc.nextInt();

        }
        mostrarCita(opcion);
        }

    //Crear metodo llamado mostrarCita
    public static void mostrarCita(int opcion) {
      switch (opcion) {
        case 1:
            System.out.println("Cuidado, es una auténtica carnicería");
            Ejercicio7menu();
            break;
        case 2:
            System.out.println("Me llamo Bond, James Bond");
            Ejercicio7menu();
            break;
        case 3:
            System.out.println("¡Qué bonito es vivir en el campo!");
            Ejercicio7menu();
            break;
        case 4:
            System.out.println("¡Que la fuerza te acompañe!");
            Ejercicio7menu();
            break;
        case 5:
            System.out.println("Adios");
            break;
    }
    }
}
