package Ejercicios;

import javax.swing.*;
import java.util.Scanner;

public class DetalleDeFactura2 {
    public static void main(String[] args) {

/*
La tarea consiste en crear una nueva clase con el método main llamada DetalleDeFactura, se requiere desarrollar
un programa que reciba datos de la factura utilizando la clase Scanner de la siguiente manera:

1. Reciba el nombre de la factura o descripción, utilizar método nextLine() para obtener el nombre de la factura con espacios.
2. Reciba 2 precios de productos de tipo double, utilizar método nextDouble() para obtener precios con decimales (,).
3. Calcule el total, sume ambos precios y agregue un valor de impuesto del 19%

Se pide mostrar en un solo String el nombre de la factura, el monto total bruto (antes de impuesto), el impuesto
y el monto total neto incluyendo impuesto.

Por ejemplo, el resultado podría ser algo así:
La factura producto de oficina tiene un total bruto de 134.78, con un impuesto de 25.6082 y el monto después
de impuesto es de 160.3882
*/

        Scanner scanner = new Scanner(System.in);

        // 1. Recibir el nombre de la factura
        System.out.println("Ingrese el nombre o descripción de la factura:");
        String nombreFactura = scanner.nextLine(); //nextLine() lee toda la línea que escriba el usuario (incluyendo espacios)

        // 2. Recibir el primer precio
        System.out.println("Ingrese el precio del primer producto:");
        double precio1 = scanner.nextDouble(); //nextDouble() lee números decimales

        // 3. Recibir el segundo precio
        System.out.println("Ingrese el precio del segundo producto:");
        double precio2 = scanner.nextDouble();

        // 4. Calcular el total bruto (sin impuesto)
        double totalBruto = precio1 + precio2;

        // 5. Calcular el impuesto (19% del total bruto)
        double impuesto = totalBruto * 0.19;

        // 6. Calcular el total neto (con impuesto)
        double totalNeto = totalBruto + impuesto;

        // 7. Mostrar el resultado
        String resultado = "La factura " + nombreFactura +
                " tiene un total bruto de " + totalBruto +
                ", con un impuesto de " + impuesto +
                " y el monto después de impuesto es de " + totalNeto;

        System.out.println("\n" + resultado);

        scanner.close();


        //ejemplo de lo que se debería imprimir:
        //"La factura producto de oficina tiene un total bruto de 134.78,
        //con un impuesto de 25.6082 y el monto después de impuesto es de 160.3882"


    }
        }
