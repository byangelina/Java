package CapitulosCurso;

public class EjemploStringMetodos {
    public static void main(String[] args) {

        //métodos para aplicar a la variable nombre

        String nombre = "Andres"; //Importante, cada carácter es un string. ya sea letra, número símbolo o espacio, y parte siempre desde cero ---> a=0, n=1 d=2, r=3, e=4, s=5, son 5 caracteres, pero se imprime 6 porque en la terminal se cuenta desde 1

        System.out.println("nombre.length() = " + nombre.length()); // nombre.length() cuenta cuántos caracteres String hay.
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase()); //nombre.toUpperCase() imprime el valor de la variable en mayúscula
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase()); //nombre.toLowerCase() imprime el valor de la variable en minúscula.
        System.out.println("nombre.equals(\"Andrés\") = " + nombre.equals("Andres")); //nombre.equals() revisa si el dato de una variable esta escrito igual o no, sirve para comparar.
        System.out.println("nombre.equals(\"andres\") = " + nombre.equals("andres"));
        System.out.println("nombre.equalsIgnoreCase(\"andres\") = " + nombre.equalsIgnoreCase("andres")); // nombre.equalsIgnoreCase() se encarga de comparar el dato de la variable pero ignora mayúsculas y minúsculas.
        System.out.println("nombre.substring(4) = " + nombre.substring(4)); //elimina caracteres del string desde el inicio. El número que usamos es la cantidad que borrará
        System.out.println("nombre.substring(1, 4) = " + nombre.substring(1, 4)); // igual que arriba, borró la posición 1, que es A y borró desde la posición 4 dejando ndr

        System.out.println("\n"); // salto de linea



        //estos no los entiendo / no los sé usar
        System.out.println("nombre.compareTo(\"andres\") = " + nombre.compareTo("Andrés")); // compara caracteres unicode
        System.out.println("nombre.compareTo(\"Aaron\") = " + nombre.compareTo("Aaron"));
        System.out.println("nombre.charAt = " + nombre.charAt(0));
        System.out.println("nombre.charAt = " + nombre.charAt(1));
        System.out.println("nombre.charAt(5) = " + nombre.charAt(5));
        System.out.println("nombre.charAt(nombre.length()-1) = " + nombre.charAt(nombre.length()-1));


        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas = " + trabalenguas.replace("a",".")); // replace es para cambiar o reemplazar algún caracter por otro, en este caso reemplazamos todas las A por un punto.
        System.out.println("trabalenguas = " + trabalenguas);
        System.out.println("trabalenguas.indexOf('a') = " + trabalenguas.indexOf('a')); // este método es para saber si se encuentra cierto caracter dentro del String (busca desde el inicio)... por ejemplo, si pedimos buscar 'a' en el valor "trabalenguas" da = 2 porque encuentra 'a' en la posición 2, parte desde 0: t=0, r=1 a=2...
        System.out.println("trabalenguas.lastIndexOf('2') = " + trabalenguas.lastIndexOf('2')); // en cambio, este método sirve para encontrar el último caracter que queramos buscar dentro del String (busca desde el último), en este caso encontró 'a' en la posición -1
        System.out.println("trabalenguas.lastIndexOf('z') = " + trabalenguas.lastIndexOf('z')); // para comprobar la búsqueda del método voy a buscar el caracter 'z' dentro de la frase "trabalenguas"


    }
}                                                                                                                                          
