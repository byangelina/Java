package Ejercicios;
import java.util.Scanner;

public class Ejercicio16_MatricesScanner {

    public static void main(String[] args) {

        // MATRICES - Recorrido con Scanner


        // Declaración -------------------------------------------------------------------------------------------------

        int matriz [][] = new int [3] [3];
        Scanner scanner = new Scanner(System.in); // aquí activo scanner


        // Asignación (con scanner) -----------------------------------------------------------------------------------

        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 3; c++) {
                System.out.println("Ingrese el valor de la posición f: " + f + " c: " + c);
                matriz[f][c] = scanner.nextInt();
                // aquí le indico que recorra la matriz, pidiendo el ingreso de números con scanner.
            }
        }


        // Recorrido ---------------------------------------------------------------------------------------------------

        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 3; c++) {
                System.out.println("El valor de la posición f: " + f + " c: " + c);
                System.out.println("Es de: " + matriz[f][c] + "\n");
            }
        }
    }
}





