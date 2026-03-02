package CapitulosCurso;

public class OperadoresIncrementales {
    public static void main(String[] args) {


        // pre incremento
        int i = 1;
        int j = ++i; // i = i + 1 = 2
        System.out.println("i = " + i); // i inicialmente vale 1, PERO el ++i se incrementa, ahora i = 2.
        System.out.println("j = " + j);
        System.out.println("\n");// salto de línea para que se vea mejor


        // post incremento
        i = 2; // i inicialmente vale 2, PERO, con el i++, ahora incrementa en 1 entonces, 2 + 1 = 3.
        j = i++; // j vale 2 porque toma el valor inicial de i, no el que toma después.
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("\n");// salto de línea para que se vea mejor


        // pre decremento
        i = 3; // i vale 2 porque a i se le resta uno abajo.
        j = --i; // j vale 2 porque es: i - 1.
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("\n");// salto de línea para que se vea mejor


        // post decremento
        i = 4; // j vale 3 porque abajo estoy restando 1 al i, entonces i = 3.
        j = i--; // j vale 4, vale el valor inicial de i, entonces j = 4.
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("++j = " + ++j);
        System.out.println("j++ = " + j++);




    }



}
