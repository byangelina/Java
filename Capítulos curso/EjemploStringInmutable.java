package CapitulosCurso;

public class EjemploStringInmutable {
    public static void main(String[] args) {

        String curso = "Programación Java";
        String profesor = "Andrés Gúzman";

        String resultado = curso.concat(profesor);
        System.out.println("Curso = " + curso);
        System.out.println("resultado = " + resultado);
        System.out.println("resultado = " + resultado);



        //esto es un bloque de código, porque está entre llaves
        String resultado2 = curso.transform(c -> { // aqui el valor de curso se llama c (como yo quiera) para no repetir el nombre curso
            return c + " con " + profesor;
        }); // esta es otra forma mas adecuada y avanzada para concatenar, con la función lambda...



        System.out.println("curso = " + curso);
        System.out.println("resultado 2 = " + resultado2);
        
        String resultado3 = resultado.replace("a","A");

        System.out.println("resultado = " + resultado);
        System.out.println("resultado3 = " + resultado3);




        
    }

}
