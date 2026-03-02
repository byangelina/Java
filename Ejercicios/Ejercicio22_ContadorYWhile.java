package Ejercicios;

import java.util.Scanner;

public class Ejercicio22_ContadorYWhile {
    public static void main(String[] args) {

    // ejemplo más básico de contador en un bucle while:

    int contador = 0;

    while (contador<10){
        System.out.println("estoy en la vuelta "  + contador);
        contador ++;

    }


    // ejemplo bucle controlado por centinela:

    boolean bandera = true;
    Scanner teclado = new Scanner(System.in);
    String respuesta;

    while (bandera == true){
        System.out.println("El valor de mi bandera es: " + bandera);
        System.out.println("¿Estas suscirto? " + bandera);

        System.out.println("¿quieres suscribirte a todoCode? (si/no)");
        respuesta = teclado.next();

        if (respuesta.equals("si")){
            bandera = false;
        }
    }



    }
}
 