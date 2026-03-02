package Ejercicios;

public class Ejercicio10_BucleWhile {

    public static void main(String[] args) {

        // BUCLES
        // Hay 2 tipos de bucles, por contador y por centinela .


        int cont = 0; // este es el contador, parte en 0

        while (cont <= 10){ // "mientras mi contador sea menor o igual a 10, mostraré un cartel que diga: "Estoy en la vuelta ..."

            System.out.println("Estoy en la vuelta " + cont);
            // si por ejemplo, while termina aquí, sería un bucle infinito porque es cierto que contador siempre es igual a 0, entonces nunca terminará de ejecutarse.

            cont = cont +1; // si cont = 0, se le suma 1 --> cont +1. Asi cada vez que dé una vuelta HASTA llegar a 10.
        }



    }
}
