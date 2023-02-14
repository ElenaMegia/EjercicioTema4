package org.example;

import java.util.Scanner;

public class Ejercicio7 {

    //El programa debe mostrar un menú con una lista de películas y una opción para salir.
    //
    //Si el usuario elige una de las películas, el programa mostrará una cita de esa película. Luego, el usuario puede elegir otra película o salir.
    //
    //Si el usuario elige salir, el programa mostrará un mensaje antes de salir.
    //
    //Ejemplo de ejecución:
    //
    //1 - Una cita de la ciudad del miedo
    //
    //2 - Una cita de James Bond
    //
    //3 - Una cita de la vida es un largo río tranquilo
    //
    //4 - Una cita de Star Wars
    //
    //5 - Salir de esta magnífica aplicación
    //
    //2
    //
    //Me llamo Bond, James Bond
    //
    //1
    //
    //Cuidado, es una auténtica carnicería
    //
    //5
    //
    //Adios
    //
    //¡Por supuesto, puede elegir las películas y las citas que prefiera!

    static Scanner sc = new Scanner(System.in);

    public static void Ejercicio7() {
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
            Ejercicio7();
            break;
        case 2:
            System.out.println("Me llamo Bond, James Bond");
            Ejercicio7();
            break;
        case 3:
            System.out.println("¡Qué bonito es vivir en el campo!");
            Ejercicio7();
            break;
        case 4:
            System.out.println("¡Que la fuerza te acompañe!");
            Ejercicio7();
            break;
        case 5:
            System.out.println("Adios");
            break;
    }
    }
}
