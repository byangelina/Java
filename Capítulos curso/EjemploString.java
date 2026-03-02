package CapitulosCurso;

public class EjemploString {
    public static void main(String[] args) {


        // método para comparar por instancia

        String curso = "Programación Java"; // esto es un objeto de tipo String

        String curso2 = new String("Programación Java :)");

        boolean esIgual = curso == curso2; // rara vez o casi nunca se usa == para comparar, se suele usar EQUALS
        System.out.println("esIgual = " + esIgual);



        // método para comparar por valor

        esIgual = curso.equals(curso2); // equals sirve para comparar valores, en este caso el texto "Programación Java"...
        System.out.println("esIgual = " + esIgual); // imprime false si no son iguales, imprime true si tienen el mismo valor :)
        // también existe el método --> curso.equalsIgnoreCase();  el IgnoreCase literalmente ignora si tienen diferencias de mayúscula o minúscula...
    
    
        
        
        String curso3 = "Programdación Java";
        esIgual = curso == curso3;
        System.out.println("curso3 = " + curso3);
        
        
    
    
    
    }
}
