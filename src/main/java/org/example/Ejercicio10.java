package org.example;

import java.util.Scanner;

public class Ejercicio10 {
    static Scanner sc = new Scanner(System.in);

    //VERSION 2

    //Crear el algoritmo anterior en metodo java
    public static void main(String[] args) {
        //Declarar variables
        int tamaño;
        String caracter;
        int forma;
        //Pedir al usuario que introduzca el tamaño
        System.out.println("¿Tamaño?");
        tamaño = sc.nextInt();
        //Pedir al usuario que introduzca el caracter
        System.out.println("¿Carácter?");
        caracter = sc.next();
        //Pedir al usuario que introduzca la forma
        System.out.println("¿Forma?");
        System.out.println("1 - rectángulo con relleno");
        System.out.println("2 - rectángulo sin relleno");
        System.out.println("3 - cruz de San Andrés");
        System.out.println("4 - triángulo rectángulo");
        System.out.println("5 - rombo");
        System.out.println("6 - ajedrezado");
        forma = sc.nextInt();
        //Comprobar si el usuario ha elegido una opción válida
        while (forma < 1 || forma > 6) {
            System.out.println("La opción introducida no es válida");
            //Pedir al usuario que introduzca la forma
            System.out.println("¿Forma?");
            System.out.println("1 - rectángulo con relleno");
            System.out.println("2 - rectángulo sin relleno");
            System.out.println("3 - cruz de San Andrés");
            System.out.println("4 - triángulo rectángulo");
            System.out.println("5 - rombo");
            System.out.println("6 - ajedrezado");
            forma = sc.nextInt();
        }
        //Mostrar el resultado
        mostrarForma(tamaño, caracter, forma);
    }

    //Crear el metodo mostrarForma
    public static void mostrarForma(int tamaño, String caracter, int forma) {
        //Comprobar si el usuario ha elegido la forma 1
        if (forma == 1) {
            //Mostrar el resultado
            for (int i = 0; i < tamaño; i++) {
                for (int j = 0; j < tamaño; j++) {
                    System.out.print(caracter);
                }
                System.out.println();
            }
        }
        //Comprobar si el usuario ha elegido la forma 2
        if (forma == 2) {
            //Mostrar el resultado
            for (int i = 0; i < tamaño; i++) {
                for (int j = 0; j < tamaño; j++) {
                    if (i == 0 || i == tamaño - 1 || j == 0 || j == tamaño - 1) {
                        System.out.print(caracter);
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
        //Comprobar si el usuario ha elegido la forma 3
        if (forma == 3) {
            //Mostrar el resultado
            for (int i = 0; i < tamaño; i++) {
                for (int j = 0; j < tamaño; j++) {
                    if (i == j || i + j == tamaño - 1) {
                        System.out.print(caracter);
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
        //Comprobar si el usuario ha elegido la forma de un triangulo rectangulo
        if (forma == 4) {
            //Mostrar el resultado de un triangulo rectangulo con ASCII
            for (int i = 0; i < tamaño; i++) {
                for (int j = 0; j < tamaño; j++) {
                    if (i == tamaño - 1 || j == tamaño - 1 || i == j) {
                        System.out.print(caracter);
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }

        //Comprobar si el usuario ha elegido la forma 5
        if (forma == 5) {
            //Mostrar el resultado de un rombo
            for (int i = 0; i < tamaño; i++) {
                for (int j = 0; j < tamaño; j++) {
                    if (i == j || i + j == tamaño - 1) {
                        System.out.print(caracter);
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }

            //Comprobar si el usuario ha elegido la forma ajedrezado
            if (forma == 6) {
                //Mostrar el resultado
                for (int i = 0; i < tamaño; i++) {
                    for (int j = 0; j < tamaño; j++) {
                        if (i % 2 == 0) {
                            if (j % 2 == 0) {
                                System.out.print(caracter);
                            } else {
                                System.out.print(" ");
                            }
                        } else {
                            if (j % 2 == 0) {
                                System.out.print(" ");
                            } else {
                                System.out.print(caracter);
                            }
                        }
                    }
                    System.out.println();
                }
            }



        }
    }
}