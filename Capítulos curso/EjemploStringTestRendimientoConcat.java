package CapitulosCurso;

public class EjemploStringTestRendimientoConcat {
    static void main(String[] args) {

        //aquí la idea es generar un loop, un for.

        String a = "a";
        String b = "b";
        String c = a;

        StringBuilder sb = new StringBuilder(a); // la diferencia del String vs StringBuilder es que, el StringBuilder es mutable, osea que se puede modificar, el String solo no se puede modificar

        long inicio = System.currentTimeMillis();

        //aquí haremos una iteración de cuanto se demora en correr el ciclo for:

        for(int i= 0; i < 500; i++) {
            //este ciclo comienza con i = 0 (i es un contador)
            // y va a finalizar la operación cuando i sea mayor a 500,
            // y la idea es que el i se incremente, esto es i++ (es lo mismo que decir i+1, incrementa en 1)...
            // finaliza cuando se cumpla todo

            /* Primero se inicializa esta variable, luego un bloque de evaluación se evalúa para poder finalizar
            este ciclo o iteración si se cumple la condición, finaliza. Es decir, si llega a 500, finaliza el foro
            y se sale y después de cada iteración, al final se va incrementando en uno.
            */

            //c = c.concat(a).concat(b).concat("\n"); // se demoró: 4 milisegundos (4ms)
            //c += a + b +"\n"; // este es otro tipo de concatenación, += es para concatenar --> se demoró 4ms
            sb.append(a).append(b).append("\n"); // Se demoró 0ms. Este es uno de los más rápidos en correr
        }

        long fin = System.currentTimeMillis();
        System.out.println(fin - inicio); // restamos el inicio con el final.
        System.out.println("c = " + c);
        System.out.println("sb = " + sb.toString());






    }

}
