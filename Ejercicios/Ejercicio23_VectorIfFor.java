package Ejercicios;

import java.util.Scanner;

public class Ejercicio23_VectorIfFor {
    public static void main(String[] args) {


        //EJERCICIO DE VECTORES + IF + FOR

        /*
        Realizar un programa que permita cargar 15 números en un vector.
        Una vez cargados, se necesita que el programa cuente e informe
        por pantalla cuántas veces se cargó el número 3.
         */

        int vector [] = new int [15]; // vector de 15 posiciones
        Scanner teclado = new Scanner(System.in); // cargar los números por teclado


        // aquí se carga el vector
        // i es el índice o posición en la que va cada número cuando recorre una vuelta
        for(int i=0; i<15; i++) {
            System.out.println("Ingrese un número para el vector: ");
            vector[i] = teclado.nextInt(); // debo introducir el número de Scanner a través del bucle for.
        }


        // aquí se recorre y se cuenta cuántos números 3 hay, para eso agrego un contador.
        int contador = 0;

        for(int i=0; i<15; i++) {
            if (vector[i] == 3){ // "Si el vector en la posición i es igual a 3, entonces..."
                contador = contador + 1; // entonces el índice incrementa en 1.
            }
        }

        System.out.println("La cantidad de números 3 que hay en el vector es: " + contador);
        teclado.close(); // se acostumbra a hacer esto para terminar de ejecutar el scanner.


    }
}
