package Ejercicios;

public class Ejercicio14_MatricesDeclaracion {

    public static void main(String[] args) {

        // MATRICES - Declaración y Asignación

        /* Ejemplo de matriz:
        Son como cajas, pero VARIAS, que van MONTADAS a los lados y de arriba / abajo (todas las que quiera).
        La posición de la caja está afuera, del 0 al 2.

        Haré una matriz de 3 x 3, es decir, tres filas y tres columnas.
        int matriz [][] = new int [3] [3];

             |    0   |    1   |    2    |
             -----------------------------
             |        |        |         |
          0  |        |        |         |
             |        |        |         |
             -----------------------------
             |        |        |         |
          1  |        |        |         |
             |        |        |         |
             -----------------------------
             |        |        |         |
          2  |        |        |         |
             |        |        |         |
             ----------------------------- */


        // Declaración -------------------------------------------------------------------------------------------------

        int matriz [][] = new int [3] [3];




        // Asignación (forma manual) -----------------------------------------------------------------------------------
        // Siempre se asigna primero, FILA. Después COLUMNA.

        matriz[0][0] = 5; // "fila 0 columna 0, agrega un 5"
        matriz [0][1] = 13;
        matriz [2][2] = 24;

        /* Esto se ve así:

            |    0   |    1   |    2    |
             -----------------------------
            |        |        |         |
         0  |    5   |   13   |         |
            |        |        |         |
            -----------------------------
            |        |        |         |
         1  |        |        |         |
            |        |        |         |
            -----------------------------
            |        |        |         |
         2  |        |        |    24   |
            |        |        |         |
            ----------------------------- */
    }
}
