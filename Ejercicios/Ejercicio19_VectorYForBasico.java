package Ejercicios;

import java.util.Scanner;

public class Ejercicio19_VectorYForBasico {

    public static void main(String[] args) {


        // Objetivo: Practicar el for básico

        /* Crea un programa que:
        1. Tenga un vector de 5 números
        2. Cargue 5 números usando Scanner
        3. Muestre todos los números cargados
        4. Al final encuentre cuál es el número más grande que ingresó el usuario

        Necesitas 1 for para cargar
        Necesitas 1 for para mostrar
        El límite debe ser i < 5 (no i <= 5)

        Ejemplo -----------
        Ingrese 5 números:
        Número 1: 10
        Número 2: 20
        Número 3: 30
        Número 4: 15
        Número 5: 8

        Los números ingresados son:
        10
        20
        30
        15
        8

        El número más grande es: 30
        */

        // vector de 5 números
        int vector [] = new int [5];


        // ingresar números con scanner
        System.out.println("-----Ingrese 5 números----");
        Scanner scanner = new Scanner(System.in);


        // cargar números con for
        for (int i = 0; i < 5; i++){
            System.out.println("Número " + (i+1) + ": ");
            vector[i] = scanner.nextInt();
        }


        // for para mostrar los números que fueron ingresados:
        System.out.println("\nlos números ingresados son: ");
        for (int i = 0; i < 5; i++){
            System.out.println(vector[i]); // esto imprime todos los números que se imprimieron

            int numeroMayor = 0;

            if (vector[i] > numeroMayor){ // "Esto dice: "Si este número es mayor al que tengo guardado, reemplázalo"
                numeroMayor = vector[i];
            }

        }
    }
}
