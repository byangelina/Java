package Apuntes;

public class Atajos {
    static void main() {

        // Apuntes.Atajos para autocompletar/editar el código más rápido:

        /*
        psvm: Public static void main

        sout: System.out.println

        fori: for (int i = 0; i <; i ++)

        Ctrl + Flecha(<-): Ir al inicio de la palabra

        Ctrl + Flecha(–>): Ir al final de la palabra

        Ctrl + F: Buscar en el fichero

        mayus + supr: Borra la linea completa

        Alt + F12: Abrir Terminal

        Guardar todo: Ctrl + S


----------------------------------------------------------------------------------------------------


        EJEMPLO doble comilla:
        String nombre = "Angela \"Pola\" ";


        EQUALS() --> Es un método que compara si dos textos (Strings) son iguales. Por ejemplo:
        String str1 = "Hola Andrés";
        String str2 = new String("Hola Ándrés"); ----> el new String es otra instancia, son diferentes.
        System.out.println("¿Son el mismo objeto?" + (str1 == str2));
        System.out.println("¿Tienen el mismo valor?" + str1.equals(str2)); -----> compara si tienen el mismo valor
        texto1.equals(texto2) --- esta es la estructura.


         \n ---> es salto de linea


        JOptionPane.showMessageDialog(null," "); --> para mostrar un mensaje por medio de una ventana. Funciona con la librería javax.swing


        JOptionPane.showInputDialog(null,""); --> para que el usuario inserte una respuesta por medio de una ventana. Funciona con la Librería javax.swing


        numero = Integer.parseInt(numeroStr); --> convierte un numero en un string


        TRY CATCH: CÓMO SE USA
        int numero = 0;   ---> este se inicializa en 0, y en el try se le asigna un valor
        try {
            numeroDecimal = Integer.parseInt(numeroStr);    ---> convierte de numero a string
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "mensaje de error");
            main(args);    ---> se agrega main() porque... no sé, se explica mas adelante (es mas avanzado)
            System.exit(0);    ---> esto se hace para finalizar el programa
            ---->  si nunca escribo lo que me pide el input, el bucle se repite hasta que haga lo que me pidió, no se puede cancelar
        }



        import java.util.Scanner;   ----> Esto va al inicio del archivo (después del package).
        Scanner scanner = new Scanner(System.in); ----> asi se activa el scanner
        System.out.println("Ingrese un número entero: ");
        String numeroStr = scanner.nextLine();  ---> significa "Lee la siguiente LÍNEA completa", lee hasta los espacios y siempre lo guarda como TEXTO, aunque hayan números



        import javax.swing.*;  ---> Importa las herramientas para crear ventanas emergentes y interfaces gráficas. Asi funciona el JOptionPane.show... por ejemplo.




        String s = null; ---> Objeto vacío, significa que un objeto s está definido, pero no se asigna espacio para el objeto, es decir, el objeto no está instanciado.

        String k = ""; ----> Valor nulo, significa que se ha creado una instancia de un objeto de cama de caracteres, es decir, el sistema ha asignado espacio para la variable, pero el contenido del objeto está vacío.

        String n = " "; ----> Espacio, significa que se ha creado una instancia de un objeto de carácter y el contenido del objeto es un espacio.



        s == null;  ---> Para juzgar si una variable de carácter es nula, use un juicio lógico igual a (==)
        Los objetos vacíos no pueden utilizar métodos de objeto como equals (), isEmpty (), etc., porque no se crean instancias.


        Formas de determinar el valor nulo:
        (1) El método equals ---> compara si el contenido de los dos objetos es el mismo. La expresión se puede expresar: k.equals ("");
        (2) El método length () ---> es para ver el número de caracteres en un objeto de cadena, que se puede juzgar por la expresión: k.length () == 0;
        (3) El método isEmpty () ---> es juzgar el número de caracteres en un objeto de cadena como 0, que se puede juzgar por la expresión: k.isEmpty ();



        Ternario: es una condición corta con dos opciones. --> condicionCorta = esteNumero >=6 ? "esMayor" : "esMenor";



        Cómo escribir un ciclo FOR -->
        for (int i = 0; i < vector.length;i++){
            // i = 0 --> i de indice
            // i < vector --> i < es la longitud, de tal posición a tal final.
            // .length; --> es un método que cuenta longitudes
            // i++ --> es el incremento




       Cómo escribir un VECTOR -->
       int vector [] = new int[4];
       //el 4 es un ejemplo de cuantos números tendrá el vector.
       //todos los vectores son siempre del mismo tipo (solo int, solo double, solo string... no combinados).
       //los vectores se pueden definir manualmente o en consola usando Scanner




       Cómo escribir una MATRIZ -->
       int matriz [][] = new int [3] [3];
       // el [3][3] es un ejemplo, quiere decir que es una matriz de 3 x 3
       // las matrices son bidireccionales, 3x3 es un cuadrado.
       // también se pueden definir manualmente o por consola usando Scanner.




       // Cómo escribir una condición con ||, significa "y" -->
       if (categoria == 1 || categoria == 2 || categoria == 3) {
       }
       // dice, si categoria es igual a 1 y categoria es igual a 2 y categoria es igual a 3, entonces..."




       */

    }
}
