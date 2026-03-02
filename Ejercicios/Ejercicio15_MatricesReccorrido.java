package Ejercicios;

public class Ejercicio15_MatricesReccorrido {

    public static void main(String[] args) {

        // MATRICES - Recorrido y carga


        // Declaración -------------------------------------------------------------------------------------------------

        int matriz [][] = new int [3] [3];


        // Asignación (forma manual) -----------------------------------------------------------------------------------

        matriz [0][0] = 5;
        matriz [0][1] = 13;
        matriz [0][2] = 96;
        matriz [1][0] = 35;
        matriz [1][1] = 33;
        matriz [1][2] = 71;
        matriz [2][0] = 446;
        matriz [2][1] = 228;
        matriz [2][2] = 24;

        /* Esto se ve así:

            |    0   |    1   |    2    |
             -----------------------------
            |        |        |         |
         0  |    5   |   13   |   96    |
            |        |        |         |
            -----------------------------
            |        |        |         |
         1  |   35   |   33   |    71   |
            |        |        |         |
            -----------------------------
            |        |        |         |
         2  |   446  |  228   |    24   |
            |        |        |         |
            ----------------------------- */


        // Recorrido ---------------------------------------------------------------------------------------------------
        // Haremos dos FOR, uno dentro de otro, ya que es una matriz bidimensional.


        for (int f = 0; f < 3; f++) {
            // FOR externo, recorre cada una de las FILAS
            // f = 0 --> f es un índice
            // f < 3 --> f < es la longitud, de f posición hasta 3.
            // f++ --> es el incremento

            for (int c = 0; c < 3; c++) {
                // FOR interno, recorre cada una de las COLUMNAS
                // c = 0 --> c es otro índice
                // c < 3 --> c < es la longitud, de c posición hasta 3.
                // c++ --> es el incremento

                System.out.println("El valor de la posición f: " + f + " c: " + c);
                System.out.println("Es de: " + matriz[f][c] + "\n");
            }
        }
    }
}










