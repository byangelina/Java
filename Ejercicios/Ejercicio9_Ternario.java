package Ejercicios;

import java.util.Scanner;

public class Ejercicio9_Ternario {

    public static void main(String[] args) {


        // cómo usar TERNARIO:
        // ternario es un condicional simple, mas breve que un if / else. Busca una opción u otra, nada más.

        double promedio;
        String condicionFinal;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el promedio general del alumno TodoCode: ");
        promedio = scanner.nextDouble(); // nextDouble porque el Tipo de promedio es double.

        // aqui viene el TERNARIO:
        condicionFinal = promedio >=6 ? "Aprobado" : "Desaprobado"; // ternario está preguntando:
                                                                    // promedio es mayor o igual a 6 ?
                                                                    // si es mayor a 6 "Aprobado"
                                                                    // si es menor a 6 "Desaprobado"

        System.out.println("La condición final del alumno es: " + condicionFinal);


    }

}
