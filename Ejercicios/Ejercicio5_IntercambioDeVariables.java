package Ejercicios;

public class Ejercicio5_IntercambioDeVariables {
    public static void main(String[] args) {

        /* Realizar un programa que permita el intercambio de valores entre dos variables.

        POR EJEMPLO: Si una variable "numero" vale 35, y una variable "numero2" vale 20,
        realizar las acciones necesarias para que numero pase a valer 20 y numero 2 pase a valer 35.

        Una vez realizado el cambio, mostrar el resultado por pantalla.
        */


                          //OBJETIVOS:
        int numero1 = 35; // numero1 = 20
        int numero2 = 20; // numero2 = 35
        int numero3 = 0;


        //  0   =   35
        numero3 = numero1; // numero3 = 35

        //  35  =   20
        numero1 = numero2; // numero1 = 20

        //  20  =    35
        numero2 = numero3; // numero2 = 35


        System.out.println("numero1 = " + numero1);
        System.out.println("numero2 = " + numero2);


    }
}
