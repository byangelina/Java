package Ejercicios;

public class Ejercicio27_varios {
    public static void main(String[] args) {

        // VARIOS EJERCICIOS


        // 1.----------------------------------------------------------------------------------------------------------
        // realizar un programa que muestre en pantalla los números del 1 al 35 (uno bajo del otro)
        // utilizar una estructura repetitiva:

        /*
        for(int numero = 0; numero < 35; numero++){
            System.out.println(numero+1);
        }
        */



        // 2.----------------------------------------------------------------------------------------------------------
        // realizar un programa que dado por teclado unn límite numérico (por ejemplo 100)
        // muestre en pantalla todos los números hasta ese límite (empezando por 1):

        /*
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número ");
        int limite = scanner.nextInt();

        for (int contador = 0; contador < limite; contador++){
            System.out.println(contador+1);
        }
        */



        // 3.----------------------------------------------------------------------------------------------------------
        // realizar un programa que muestre por pantalla los números del 200 al 250 saltando de 2
        // en 2. La secuencia debería ser: 200... 202.. 204.. etc...

        /*
        for (int contador = 199; contador < 251; contador++){
            System.out.println(contador = contador +1);
        }
        */



        // 4.----------------------------------------------------------------------------------------------------------
        // realizar un programa que lleve a cabo la cuenta regresiva para el año nuevo. la cuenta debe comenzar en
        // 10 y terminar en 1

        /*
        System.out.println("cuenta regresiva de año nuevo");
        for (int conteo = 10; conteo >= 0; conteo--){
            System.out.println(conteo);
        }
        */



        // 5. ----------------------------------------------------------------------------------------------------------
        // realizar un programa que muestre por pantalla palabras que sean ingresadas por teclado hasta que
        // se ingrese la palabra "salir".

        /*
        Scanner palabras = new Scanner(System.in);
        String respuesta = " ";

        while (!respuesta.equalsIgnoreCase("salir")) {
            System.out.println("Ingrese una palabra");
            respuesta = palabras.next();

            if (!respuesta.equalsIgnoreCase("salir")) {
                System.out.println("Usted escribió:" + respuesta);
            }
        }
        */



        // 6. ----------------------------------------------------------------------------------------------------------
        // El usuario introducirá un número por teclado y el programa dirá si se trata
        // de un número positivo o negativo.

        /*
        System.out.println("Por favor ingrese un número entero: ");
        Scanner linea = new Scanner(System.in);
        int x = linea.nextInt();

        if (x <= 0){
            System.out.println("El número ingresado es negativo");
        }
        else {
            System.out.println("El número ingresado es positivo");
        }
        */



        // 7.----------------------------------------------------------------------------------------------------------
        // El usuario introduce una nota; si esta nota es mayor o igual a 5 se
        // le mostrará un mensaje diciendo que ha aprobado y en caso de que no se cumpla la
        // condición se mostrará un mensaje diciendo que está reprobado.

        /*
        System.out.println("Introduzca una nota: ");
        Scanner scanner = new Scanner(System.in);
        double notas = scanner.nextDouble();

        if(notas>=5){
            System.out.println("Aprobado");
        }
        else {
            System.out.println("Reprobado");
        }
        */











    }
}