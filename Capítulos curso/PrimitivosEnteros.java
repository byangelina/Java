package CapitulosCurso;

public class PrimitivosEnteros {
    static void main() {

    /*
    Bit: es la "unidad" más pequeña de "información", no es un valor numérico.
    Byte: es el "número" entero más pequeño. Ocupa 8 bits y puede almacenar valores del -128 al 127.

    - Tipos de datos numéricos:
        byte: 8 bits (-128 a 127)
        short: 16 bits (-32,768 a 32,767)
        int: 32 bits (valor por defecto para enteros)
        long: 64 bits

    - Cómo van incrementando:
        byte: 8 bits
        short: 16 bits (8 × 2)
        int: 32 bits (16 × 2)
        long: 64 bits (32 × 2)
    */

        byte numeroByte = 127;
        System.out.println("\nNumero Byte = " + numeroByte);
        System.out.println("- Tipo Byte corresponde en Byte a: " + Byte.BYTES);
        System.out.println("- Tipo Byte corresponde en Bites a: " + Byte.SIZE);
        System.out.println("- El valor máximo de un Byte es de: " + Byte.MAX_VALUE);
        System.out.println("- El valor mínimo de un Byte es de: " + Byte.MIN_VALUE);

        short numeroShort = 32767;
        System.out.println("\nNumero Short = " + numeroShort);
        System.out.println("- Tipo Short corresponde en Byte a: " + Short.BYTES);
        System.out.println("- Tipo Short corresponde en Bites a: " + Short.SIZE);
        System.out.println("- El valor máximo de un Short es de: " + Short.MAX_VALUE);
        System.out.println("- El valor mínimo de un Short es de: " + Short.MIN_VALUE);

        int numeroInt = 2147483647;
        System.out.println("\nNumero int = " + numeroInt);
        System.out.println("- Tipo int corresponde en Byte a: " + Integer.BYTES);
        System.out.println("- Tipo int corresponde en Bites a: " + Integer.SIZE);
        System.out.println("- El valor máximo de un int es de: " + Integer.MAX_VALUE);
        System.out.println("- El valor mínimo de un int es de: " + Integer.MIN_VALUE);

        long numeroLong = 9223372036854775807L; // el long para que funcione debe llevar una L (mayúscula o minúscula)
        System.out.println("\nNumero long = " + numeroLong);
        System.out.println("- Tipo long corresponde en Byte a: " + Long.BYTES);
        System.out.println("- Tipo long corresponde en Bites a: " + Long.SIZE);
        System.out.println("- El valor máximo de un long es de: " + Long.MAX_VALUE);
        System.out.println("- El valor mínimo de un long es de: " + Long.MIN_VALUE);

        var numeroVar = 2147483647L;
        System.out.println("\nNúmero var = es una forma de declarar variables, el compilador infiere automáticamente el tipo de dato");
        System.out.println("- Puede ser: var tipo long: 9223372036854775807L");
        System.out.println("- Puede ser: var tipo float: 9223372036854775807F");
        System.out.println("- Puede ser: var tipo Double: 9223372036854775807D");
        System.out.println("- De esta forma se va incrementando el var, con la letra al final");
        // var: se infiere el tipo de dato automáticamente según el valor asignado.
        // Importante: var deja que Java deduzca el tipo, pero no cambia qué tipo es realmente la variable.
        
    }
}
