package Ejercicios;

public class Ejercicio12_VectoresDeclaracionRecorrido {
    public static void main(String[] args) {


        // VECTORES - Cómo declarar y asignar valores a un vector

        /* Ejemplo de vector:
        Son como cajas alineadas, puede ser 1 COLUMNA o 1 FILA. Parten en la posición 0 y guardan números en la memoria.
        Por ejemplo, número 3, posición 0.
        Esta es una caja con [4] espacios (0 a 3)

        |    0   |    1   |    2    |    3   |
        --------------------------------------
        |        |        |         |        |
        |        |        |         |        |
        |        |        |         |        |
        --------------------------------------
        */


        // Declaración -------------------------------------------------------------------------------------------------

        // Puedo declarar de esta forma -->  int vector []; estoy indicando que el espacio de vectores que voy a utilizar
        // lo voy a definir a futuro. por eso está vacío.

        // Esta es otra forma de definirlo, asignando ahora cuántos vectores voy a utilizar.

        int vector [] = new int[4];



        // Asignación (manual) -----------------------------------------------------------------------------------------

        vector [0] = 2;
        vector [1] = 35;
        vector [2] = 48;
        vector [3] = 157;


        /* Se ve así nuestra tabla:

        |    0   |    1   |    2    |    3   |
        --------------------------------------
        |        |        |         |        |
        |   2    |   35   |    48   |   157  |
        |        |        |         |        |
        --------------------------------------

        Antes teníamos una sola variable con un solo valor, como int numero = 3
        Pero con VECTORES, ahora podemos darle MULTIPLES VALORES a una sola variable.

        SIEMPRE siendo del MISMO TIPO, NO PUEDEN SER DISTINTOS, en la tabla: 2, 35, 48, 157 son INT.
        Asi se definió arriba --> int vector [] = new int [4];  */




        // Recorrido --------------------------------------------------------------------------------------------------

        for (int i = 0; i < vector.length;i++){
            // i = 0 --> i de indice
            // i < vector --> i < es la longitud, de tal posición a tal final.
            // .length; --> es un método que cuenta longitudes
            // i++ --> es el incremento

            System.out.println("Estoy en el índice: " + i);
            System.out.println("Tengo guardado un " + vector[i]);
            System.out.println("-------------------");


           /* Esto va a recorrer la tabla desde la posición 0 hasta la 3.
           El for (se ejecutará) dará 4 vueltas.

            Estoy en el índice: 0
            Tengo guardado un 2
            ----------------------
            Estoy en el índice: 1
            Tengo guardado un 35
            ----------------------
            Estoy en el índice: 2
            Tengo guardado un 48
            ----------------------
            Estoy en el índice: 3
            Tengo guardado un 157
            ---------------------- */
        }




    }
}
