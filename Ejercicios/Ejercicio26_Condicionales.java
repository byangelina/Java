package Ejercicios;

import java.util.Scanner;

public class Ejercicio26_Condicionales {
    public static void main(String[] args) {

        // EJERCICIO DE REPETITIVAS: mostrar números hasta limite

        /* Realizar un programa que dado por teclado un límite numérico
        (por ejemplo 100) muestre en pantalla todos los números hasta
        ese límite (empezando por 1). */

        int numeroLimitado  = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un límite numérico (para mostrar varios números hasta llegar a ese límite): ");
        numeroLimitado = teclado.nextInt();

        for(int i = 1; i<numeroLimitado +1; i++){
            System.out.println("número " + i);
        }
        teclado.close();
    }
}
