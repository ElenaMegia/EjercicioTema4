package org.example;

import java.util.Scanner;

public class Ejercicio7 {

    //VERSION 2

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
                //Crear un numero aleatorio entre 1 y 3
                int numeroAleatorio = (int) (Math.random() * 3 + 1);
                //Mostrar una cita aleatoria
                if(numeroAleatorio == 1){
                    System.out.println("Cuidado, es una auténtica carnicería");
                }else if(numeroAleatorio == 2){
                    System.out.println("Frase 2 de ciudad del miedo");
                }                else if(numeroAleatorio == 3){
                    System.out.println("Frase 3 de ciudad del miedo");
                }
                Ejercicio7();
                break;
            case 2:
                //Crear un numero aleatorio entre 1 y 3
                 numeroAleatorio = (int) (Math.random() * 3 + 1);
                //Mostrar una cita aleatoria
                if(numeroAleatorio == 1){
                    System.out.println("Me llamo Bond, James Bond");
                }else if(numeroAleatorio == 2){
                    System.out.println("Ponga las dos manos en el volante, soy un pasajero muy nervioso.");
                }                else if(numeroAleatorio == 3){
                    System.out.println("Un arma y una radio. Habéis tirado la casa por la ventana.");
                }
                Ejercicio7();
                break;
            case 3:
                numeroAleatorio = (int) (Math.random() * 3 + 1);
                if(numeroAleatorio == 1){
                    System.out.println("¡Qué bonito es vivir en el campo!");
                }else if(numeroAleatorio == 2){
                    System.out.println("Cita 2 de la vida es un largo río tranquilo");
                }                else if(numeroAleatorio == 3){
                    System.out.println("Cita 3 de la vida es un largo río tranquilo");
                }
                Ejercicio7();
                break;
            case 4:
                numeroAleatorio = (int) (Math.random() * 3 + 1);
                if(numeroAleatorio == 1){
                    System.out.println("¡Que la fuerza te acompañe!");
                }else if(numeroAleatorio == 2){
                    System.out.println("El miedo es el camino hacia el Lado Oscuro. El miedo lleva a la ira, la ira lleva al odio, el odio lleva al sufrimiento. Yoda");
                }                else if(numeroAleatorio == 3){
                    System.out.println("Yo soy tu padre. (Darth Vader)");
                }
                Ejercicio7();
                break;
            case 5:
                System.out.println("Adios");
                break;
        }
    }



}
