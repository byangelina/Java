package CapitulosCurso;

public class PrimitivosFloat {
    static void main() {

        float realFloat = 1.0f;
        System.out.println("Real float = " + realFloat);

        /*
        NÚMEROS POSITIVOS --> a la derecha
        Se usa f para indicar que es un flotante (no se puede poner solo el número).

        EJEMPLO 1:
        1.0f o 20120f

        EJEMPLO 2:
        2.12e3f = 2120.0 --> e3 significa "exponente 3", se corre la coma hacia la derecha, agregando
        los ceros para rellenar espacios. En este caso 3 espacios.

        EJEMPLO 3:
        1.5e4f = 15000.0 --> se movió la coma hacia la derecha 4 espacios.

        NÚMEROS NEGATIVOS --> a la izquierda
        EJEMPLO 1:
        1.5e-10f = 0.00000000015f --> agregamos 10 espacios a la izquierda y la coma.
        */

        System.out.println("Float corresponde en byte a = " + Float.BYTES);
        System.out.println("Float corresponde a bites a = " + Float.SIZE);
        System.out.println("Máximo valor para float = " + Float.MAX_VALUE);
        System.out.println("Mínimo valor para float = " + Float.MIN_VALUE);

        System.out.println("\n");

        double realDoble = 3.4028235E39; // agregue el número máximo de float, pero lo aumente al final, solo es soportado con double.
        System.out.println("Double corresponde en byte a = " + Double.BYTES);
        System.out.println("Double corresponde en bites a = " + Double.SIZE);
        System.out.println("Máximo valor para double = " + Double.MAX_VALUE);
        System.out.println("Mínimo valor para double = " + Double.MIN_VALUE);

        System.out.println("\n");

        var varFlotante = 3.1416;
        System.out.println("Var flotante = " + varFlotante);

    }

}
