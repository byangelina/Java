package Ejercicios;
import java.util.Scanner; // ponerlo si se va usar scanner

public class Ejercicio13_VectoresScanner {

    public static void main(String[] args) {

        // VECTORES - Cómo implementar SCANNER


        // Declaración -------------------------------------------------------------------------------------------------

        int vector [] = new int[4];



        // Asignación (por scanner) -----------------------------------------------------------------------------------------

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < vector.length;i++){

        System.out.println("Ingrese el valor para el indice " + i + ": ");
        vector[i] = scanner.nextInt(); // asi se usa el scanner en VECTORES



        // Recorrido --------------------------------------------------------------------------------------------------

            System.out.println("Estoy en el índice: " + i);
            System.out.println("Tengo guardado un " + vector[i]);
            System.out.println("-------------------");


           /* Esto va a recorrer el número ingresado en consola (debido al Scanner) desde la posición 0 hasta la 3.
           El for (se ejecutará) dará 4 vueltas.

           Ingrese el valor para el indice 0:
           1
           Estoy en el índice: 0
           Tengo guardado un 1
           -------------------
           Ingrese el valor para el indice 1:
           2
           Estoy en el índice: 1
           Tengo guardado un 2
           -------------------
           Ingrese el valor para el indice 2:
           5
           Estoy en el índice: 2
           Tengo guardado un 5
           -------------------
           Ingrese el valor para el indice 3:
           984
           Estoy en el índice: 3
           Tengo guardado un 984
           ------------------- */
        }
    }
}











