package CapitulosCurso;

public class EjemploStringValidar {

    public static void main(String[] args) {


        String curso = null;

        boolean esNulo = curso == null;
        System.out.println("esNulo = " + esNulo); // lanza true, porque efectivamente es nulo.

        if(esNulo) {
            curso = ""; //"Programación en Java.";
        }

        boolean esVacio = curso.length() == 0; // length avisa la cantidad de caracteres que contiene el valor de la variable. En este caso va a evaluar si está vacío, osea si es 0 o no.
        System.out.println("esVacio = " + esVacio);

        boolean esVacio2 = curso.isEmpty(); //isEmpy significa "si es distinto"
        System.out.println("esVacio2 = " + esVacio2);

        boolean esBlanco = curso.isBlank(); // isBlank es como isEmpy() pero mucho más estricto y mas bueno y mas actual en java
        System.out.println("esBlanco = " + esBlanco);


        if(esBlanco == false){
            System.out.println(curso.toUpperCase()); // si es nulo se mostrará en mayúsculas con UpperCase
            System.out.println("Bienvenido al curso ".concat(curso)); // imprimir esto no funciona porque diría "Bienvenido al curso null"
        }






/*
        String saludar = null;

        boolean esNulo = saludar == null;
        System.out.println("esNulo = " + esNulo);

        if(esNulo==true){
            System.out.println(saludar.toUpperCase());
        }
        else{
                System.out.println("esNulo = " + esNulo);
        }
        System.out.println("Bienvenido " + saludar);
*/





    }
}
