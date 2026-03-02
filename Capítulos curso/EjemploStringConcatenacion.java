package CapitulosCurso;

public class EjemploStringConcatenacion {
    public static void main(String[] args) {


        // método para comparar por instancia

        String curso = "Programación Java";
        String profesor = "Andrés Guzmán";
        String detalle = curso + " con el instructor " + profesor;

        System.out.println(detalle);

        int numeroA = 10;
        int numeroB = 5;

        System.out.println("1. " + detalle + " " + numeroA + numeroB); // se imprime 105 en vez de SUMAR 10 + 5... CONCATENÓ todo.


        // para concatenar todo se deben poner los valores entre paréntesis
        System.out.println("2. " + detalle + " " + (numeroA + numeroB)); // aqui suma los dos números


        String detalle2 = curso.concat(" con ".concat(profesor)); // este método sirve para concatenar de forma más rápida y correcta
        System.out.println("detalle2 = " + detalle2);


        
        

    }



}
