package CapitulosCurso;
import javax.swing.*;
import java.util.Scanner;

public class SistemasNumericosEntradaScanner {
static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Ingrese un número entero: ");
    String numeroStr = scanner.nextLine();


    int numeroDecimal = 0;
    try {
        numeroDecimal = Integer.parseInt(numeroStr);
    } catch (NumberFormatException e) {
        System.out.println("Error, debe ingresar un numero entero");
        main(args);
        System.exit(0);
    }

    String resultadoBinario = "numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
    System.out.println(resultadoBinario);


    int numeroBinario = 0b11110;
    System.out.println("numeroBinario = " + numeroBinario);


    String resultadoOctal = "numero octal de " + numeroBinario + " = " + Integer.toOctalString(numeroDecimal);
    System.out.println(resultadoOctal);
    int numeroOctal = 036;
    System.out.println("numeroOctal = " + numeroOctal);


    String resultadoHex = "numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);
    System.out.println(resultadoHex);

    int numeroHex = 0x1e;
    System.out.println("numeroHex = " + numeroHex);



    String mensaje = resultadoBinario;
    mensaje += "\n" + resultadoOctal;
    mensaje += "\n" + resultadoHex;

    System.out.println(mensaje);

}
        }





