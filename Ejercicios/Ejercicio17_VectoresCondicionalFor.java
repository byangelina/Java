package Ejercicios;
import java.util.Scanner;

public class Ejercicio17_VectoresCondicionalFor {

    public static void main(String[] args) {

        // Vectores + If + For

        /* EJERCICIO
        Realizar un programa que permita cargar 15 números en un vector.
        Una vez cargados, se necesita que el programa cuente e informe por pantalla
        cuántas veces se cargó el número 3.
        */

        int vector[] = new int[15]; // Crea espacio para 15 números
        Scanner scanner = new Scanner(System.in);


        // PASO 1: Cargar los 15 números
        System.out.println("Ingrese 15 números: ");
        for (int i = 0; i < 15; i++) { // i va de 0 a 14 (15 números en total)

            // "para un entero igual a 0;
            // entero es menor a 15;
            // entero incrementa de uno en uno"

            vector[i] = scanner.nextInt();
        }


        // PASO 2: Contar cuántos son 3
        int contador = 0;
        for (int i = 0; i < 15; i++) {

            // para un entero igual a 0,
            // entero menor a 15;
            // entero incrementado de uno en uno"

            if (vector[i] == 3) { // ¿Este número es 3?
                                  // Sí, aumenta el contador

                contador ++; // es lo mismo que: contador = contador + 1;
            }
        }


        // PASO 3: Mostrar resultado
        System.out.println("\nEl programa cargó " + contador + "veces el número 3");
        scanner.close();

    }
}





