package CapitulosCurso;

public class PrimitivosCaracteres {
    static void main() {

        char caracter = '\u0040';
        char decimal = 64;
        System.out.println("caracter = " + caracter); //caracter es de valor /u0040, es @ en unicode.
        System.out.println();

        System.out.println("decimal = " + decimal); //decimal tiene valor 64;
        System.out.println("decimal = caracter: " + (decimal == caracter)); //decimal es igual a caracter, esto siempre es true.
        System.out.println();

        char simbolo = '@';
        System.out.println("simbolo = " + simbolo); //"simbolo es igual a @
        System.out.println("Simbolo = caracter: " + (simbolo == caracter)); //simbolo es igual a caracter, siempre dará true.
        System.out.println();

        char espacio = '\u0020'; // el espacio se representa '\u0020' o ' ' vacío.
        char retroceso = '\b'; // esto significa retroceso, se borra el ultimo caracter al imprimir, lo puedo concatenar cuantas veces quiera.
        char tabulador = '\t';
        char nuevalinea = '\n';
        char retornoCarro = '\r';

        System.out.println("char corresponde en byte:" + espacio + Character.BYTES); //agrega un espacio antes del caracter.
        System.out.println("char corresponde en byte:" + retroceso + Character.BYTES); //retrocede un espacio antes del caracter.
        System.out.println("char corresponde en byte:" + retroceso + retroceso + Character.BYTES); //retrocede dos veces antes del caracter.
        System.out.println("char corresponde en byte:" + tabulador + Character.BYTES); //tabula antes del caracter.
        System.out.println("char corresponde en byte:" + nuevalinea + Character.BYTES); //en vez de saltar una línea hacia delante, borra una línea de texto anterior
        System.out.println("char corresponde en byte:" + retornoCarro + Character.BYTES); //hace un salto de linea
        System.out.println("char corresponde en byte = " + Character.SIZE); //calcula la cantidad de letras/vocales del caracter.
        System.out.println("Character.MIN_VALUE = " + Character.MIN_VALUE); //calcula la cantidad minima del caracter. También puedo escribir entre comillas "\tbyte".

    }
}
