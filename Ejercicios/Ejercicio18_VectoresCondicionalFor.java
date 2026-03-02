package Ejercicios;

import java.util.Scanner;

public class Ejercicio18_VectoresCondicionalFor {

    public static void main(String[] args) {

        /*
        Realizar un programa que permita cargar 10 números en un vector.
        Una vez cargados, se necesita que el programa:

        Cuente cuántas veces se cargó un número PAR (divisible por 2)
        Cuente cuántas veces se cargó un número IMPAR
        Informe ambos resultados por pantalla

        Ejemplo de salida:
        Ingrese 10 números:
        Número 1: 5
        Número 2: 8
        Número 3: 3
        Número 4: 2
        ...

        Resultados:
        Números pares: 4 veces
        Números impares: 6 veces
        */


        // vector de 10 números
        int vector[] = new int[10];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese 10 números");



        // for para cargar los números
        for (int i = 0; i < 10; i++) {
            System.out.println("Número: " + (i+1) + ": " );
            vector[i] = scanner.nextInt();
        }


        // para contar pares e impares
        int contadorPar = 0;
        int contadorImpar = 0;

        for (int i = 0; i < 10; i++){
            if (vector[i] % 2 == 0) {
                contadorPar++;
            } else {
                contadorImpar++;
            }
        }

        // resultados por pantalla
        System.out.println("\n------- Resultados --------");
        System.out.println("Números pares: " + contadorPar);
        System.out.println("Números impares: " + contadorImpar);

    }
}



