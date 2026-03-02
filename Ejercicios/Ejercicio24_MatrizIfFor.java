package Ejercicios;

import java.util.Scanner;

public class Ejercicio24_MatrizIfFor {
    public static void main(String[] args) {


        //EJERCICIO MATRICES + IF + FOR

        /*

        En una tabla de 4 filas y 4 columnas se guardan las notas de 4 alumnos de secundaria.
        Cada fila corresponde a las notas y la promedio de cada alumno.

        Se necesita un programa que permita a un profesor cargar:
        en las 3 posiciones (columnas) de cada fila,
        - las notas del alumno
        - y que en la última columna se calculen los promedios.

        Una vez realizados los cálculos, se desea mostrar:
        - las 3 notas de cada alumno
        - y el promedio correspondiente recorriendo la matriz.

         */


        double matriz [][] = new double [4][4];
        Scanner teclado = new Scanner(System.in);
        double suma = 0.0; // se pone 0.0 porque el double es DECIMAL

        // Primero for para cargar las notas. Son 2 FOR porque es BIDIMENSIONAL, es columna y fila.
        for(int f=0; f<4; f++){ // f --> fila
            for(int c=0; c<3; c++){ // c --> columna
                System.out.println("\n");
                System.out.println("Ingrese las notas del alumno n°" + f + ": ");
                matriz[f][c] = teclado.nextDouble();
                suma = suma + matriz [f][c];

            }
            matriz[f][3] = suma/3;
            suma = 0.0; // se restablece en 0 para que en la siguiente vuelta inicie en 0, si no, el siguiente alumno acumularía las notas del alumno anterior.
        }


        // for para recorrer
        for(int f=0; f<4; f++) { // f --> fila
            System.out.println("Las notas del alumno n°" + f + " son: ");
            for (int c = 0; c < 3; c++) { // c --> columna
                System.out.println("Nota n°" + c + " " + matriz[f][c]);
            }
            System.out.println("El promedio de las notas es: " + matriz[f][3] + "\n");
        }
    }
}
