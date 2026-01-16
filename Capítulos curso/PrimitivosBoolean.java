package CapitulosCurso;

public class PrimitivosBoolean {
    static void main() {



        boolean datoLogico = true;
        //se puede escribir simplemente como arriba (más práctico) o poner:
        //boolean datologico = Boolean.FALSE;
        System.out.println("dato logico = " + datoLogico);


        double d = 98765.43e-3; //98.76543 mueve la coma hacia la izquierda
        System.out.println("d = " + d);


        float f = 1.2345e2f; //123.45 mueve la coma hacia la derecha
        System.out.println("f = " + f);


        datoLogico = (d < f);
        System.out.println("Dato Logico = " + datoLogico);


        boolean esIgual = (3-2 == 1); //esto responde si la operación 3-2 = 1 es true o false
        System.out.println("esIgual = " + esIgual);



    }
}

