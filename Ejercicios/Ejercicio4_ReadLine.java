package Ejercicios;

public class Ejercicio4_ReadLine {
    public static void main(String[] args) {

        String nombre;
        System.out.print("Dime tu nombre: ");
        nombre = System.console().readLine(); // esto guarda en una variable el texto que el usuario ingresa a la terminal.
        System.out.print("Hola " + nombre + "encantado de conocerte!");

    }
}


//es mejor usar este código más moderno, según la ia:

/*
import.java.util.Scanner;
public class Ejercicio {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Dime tu nombre: ");
        String nombre = scanner.nextLine();

        System.out.println("Hola " + nombre + "encantado de conocerte"!);
        scanner.close();

    }
}
*/