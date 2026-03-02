package Ejercicios;

public class Ejercicio3_TiposDeDatos {
    public static void main(String[] args) {

        /*
        Escribe un programa en el que se declaren las variables enteras x e y.
        Asignales los valores 144 y 999 respectivamente. A continuación, muestra por pantalla
        el valor de cada variable, la suma, la resta, la división y la multiplicación.
        */


        Integer x = 144;
        Integer y = 999;


        int suma = x + y;
        int resta = x + y;
        double division;
        division = (double)x / (double)y;
        int multiplicacion = x * y;


        System.out.println(
                "Valor de x: " + x + "\n" +
                "Valor de y: " + y + "\n" +
                "Valor de la suma: x + y = " + suma + "\n" +
                "Valor de la resta: x + y = " + resta + "\n" +
                "valor de la división: x / y = " + division + "\n" +
                "Valor de la multiplicación: x * y = " + multiplicacion);









    }
}
