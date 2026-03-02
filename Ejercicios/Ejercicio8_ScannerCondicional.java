package Ejercicios;
import java.util.Scanner;

public class Ejercicio8_ScannerCondicional {

    public static void main(String[] args) {

        /*
        Una pequeña despensa desea calcular los sueldos de uss empleados.

        Los puestos de los mismos pueden tener 3 categorías:
        1- repositor: cobra $15.890 + un bono del 10%.
        2- cajero: cobra 25.630,89 fijo.
        3- supervisor: cobra $35.560,20 en bruto al cual se les descuenta un 11% de jubilación.

        Se necesita un programa que, dependiendo del tipo de empleado del que
        se trate, se calcule y muestre en pantalla el correspondiente sueldo.
         */


        double sueldo = 0; // pongo = 0 porque sino el resultado final en la impresión da error, debe iniciar con algún número, no vacío.
        int categoria;

        double repositor;
        double cajero;
        double supervisor;

        System.out.println("Ingrese el tipo de categoría que desea calcular el sueldo: ");
        Scanner scanner = new Scanner(System.in);
        categoria = scanner.nextInt(); // para que el usuario escoja una opción numérica (ya que categoria es int).


        if (categoria == 1) { //repositor
            sueldo = 15890 + (15890 * 0.10); //multiplico 0.10 al sueldo base, luego se lo sumo al sueldo base.
        } else if (categoria == 2) { //cajero
            sueldo = 25630.89;
        } else if (categoria == 3) { //supervisor
            sueldo = 35560.20 - (35560.20 * 0.11);
        } else { //error
            System.out.println("Error, ingrese un numero válido");
        }

        if (categoria == 1 || categoria == 2 || categoria == 3) {
            System.out.println("El total del sueldo para la categoría seleccionada " + categoria + " es igual a: " + sueldo);

            // Para evitar que imprima el total y solo se haga cuando cumpla con los números 1, 2 o 3. Ejemplo:
            /*
            Ingrese el tipo de categoría que desea calcular el sueldo:
            9
            Error, ingrese un numero válido
            El total del sueldo para la categoría seleccionada 9 es igual a: 0.0
            */
        }
    }
}