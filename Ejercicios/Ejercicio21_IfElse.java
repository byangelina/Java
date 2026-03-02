package Ejercicios;

import java.util.Scanner;

public class Ejercicio21_IfElse {

    public static void main(String[] args) {

        /*
        Una mercería vende canutillos y mostacillas al por mayor mediante su página web
        Como se trata de paquetes de una mayorista, solicita la cantidad de paquetes en
        cada venta y dependiendo de esta realiza los siguientes controles:

        - Si la cantidad de productos es menor a 5:
            Se debe emitir un mensaje indicando que no se permiten compra inferiores a 5 productos.

        - Si la cantidad de productos es mayor o igual a 5 pero menor o igual a 15:
        Se debe emitir un mensaje que el costo de envío es de $10 USD.

        - Si la cantidad de productos es mayor a 15:
        Se debe emitir un mensaje de que el envío es gratuito.

        Realizar el programa necesario para llevar a cabo los 3 controles citados.

        ADEMÁS:
        Solicitar, además de la cantidad de paquetes, el costo total que suma la compra en $USD
        y aplicar las siguientes promociones.

        - Si el monto total es inferior a 100 USD:
            No hay promociones. Informar cuántos $USD más necesita para poder entrar en una promoción.

        - Si el monto supera los 100 USD pero es menor a los 300:
            Informar que posee un descuento del 5% sobre el total.
            Especificar cuánto sería el nuevo monto total con el descuento.

        - Si el monto supera los 300 USD:
            Informar que posee un descuento del 10%.
            Especificar cuánto sería el nuevo monto total con un descuento.
        */


        System.out.println("\nBienvenido a la tienda de canutillos y mostacillas al por mayor");
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de productos que desea comprar: ");
        int cantidadProductos = teclado.nextInt();

        System.out.println("Ingrese el costo total de su compra en USD: ");
        double costoTotal = teclado.nextDouble();



        // ---- Control de envío ----

        if (cantidadProductos < 5){
            System.out.println("\nNo se permiten compras inferiores a 5.");

        } else if (cantidadProductos >= 5 && cantidadProductos <= 15) {
            System.out.println("\nEl costo de envío es de $10 USD.");
        }
        else {
            System.out.println("\nEl envío es gratuito ¡Muchas gracias!");
        }



        // ---- Control de promociones ----

        if (costoTotal < 100){ // Cuánto falta
            double diferencia = 100 - costoTotal;
            System.out.println("No hay promociones disponibles.");
            System.out.println("Le faltan $" + diferencia + " USD para entrar en una promoción.");

        } else if (costoTotal >= 100 && costoTotal <= 300) {
            double descuento = costoTotal * 0.05;
            double totalConDescuento = costoTotal - descuento; // Resta descuento
            System.out.println("\nPosee un descuento del 5%.");
            System.out.println("Descuento aplicado: $" + descuento + " USD");
            System.out.println("Nuevo total: $" + totalConDescuento + " USD");

        } else {
            double descuento = costoTotal * 0.10;            // Calcula 10%
            double totalConDescuento = costoTotal - descuento; // Resta descuento
            System.out.println("\nPosee un descuento del 10%.");
            System.out.println("Descuento aplicado: $" + descuento + " USD");
            System.out.println("Nuevo total: $" + totalConDescuento + " USD");
        }

        teclado.close();

    }
}
