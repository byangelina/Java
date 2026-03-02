package CapitulosCurso;

import javax.swing.*;

public class OperadoresAritmeticos {
    public static void main(String[] args) {

        int a = 2;
        int b = 8;

        // también se pueden definir las variables de esta forma:
        // int a=2, b=8;


        int i=5, j= 4;
        int suma = 1+2;
        System.out.println("suma = " + suma);
        System.out.println("i + j = " + i + j + "\n");
    
        
        int resta = i - j;
        System.out.println("resta = " + resta);
        System.out.println("i - j = " + (i - j) + "\n"); // la operación tiene que estar en paréntesis para que no de error.
       
       
        int multi = i * j;
        System.out.println("multi = " + multi );
        System.out.println("i * j = " + multi + "\n");


        int div = i / j;
        System.out.println("div = " + div + "\n");
        float div2 = (float) i / j; // se usa (float) para forzar que el int sea float, sino da error.


        int resto = i % j;
        System.out.println("resto = " + resto + "\n");


        resto = 8 % 5;
        System.out.println("resto = " + resto + "\n");


        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));
        if (numero % 2 == 0){
            System.out.println("número par = " + numero);
        } else {
            System.out.println("número impar = " + numero);
        }
    }
}
