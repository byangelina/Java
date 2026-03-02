package Ejercicios;

public class Ejercicio2_Int {
    public static void main() {

        // Modifica el programa anterior para que además se muestre tu dirección
        // y tu número de teléfono. Asegúrate de que los datos se muestran en líneas
        // separadas.

        String mi_nombre = "Angela";
        String direccion = "Manuel Rodriguez 90";
        int telefono = 46802129; // uso int en vez de integer porque es más rápido y ocupa menos memoria
        String codigo = "+569 ";

        System.out.println("Nombre: " + mi_nombre);
        System.out.println("Dirección: " + direccion);
        System.out.println("Número de celular: " + codigo + telefono);






        // Diferencia entre primitivos y no primitivos:

        /* Variables no primitivas: Integer, Double, Boolean, Character, etc.
           - Se escriben en minúscula.
           - Guardan directamente el valor.
           - No pueden usar Null (vacío).

           Variables primitivas: int, double, boolean, char, long, float, byte, short.
           - Se escriben con mayúscula inicial.
           - Son objetos que "envuelven" el valor primitivo.
           - Pueden tener el valor especial null (que significa "sin valor").
           - Tienen métodos útiles.
         */

    }
}
