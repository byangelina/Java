package Ejercicios;

public class Ejercicio_Array {

    static void main() {

        // Escribe un programa que muestre por pantalla 10 palabras en inglés junto
        // a su correspondiente traducción al castellano. Las palabras deben estar
        // distribuidas en dos columnas y alineadas a la izquierda. Pista: Se puede
        // insertar un tabulador mediante \t.

        String[] ingles = {"Hello","How are you?","Thanks","Bye","I wanna","Im hungry","Im tired","Im playing","Give me that","Take me"};
        String[] espanol = {"Hola","¿Cómo estás?","Gracias","Adiós","Yo quiero","Tengo hambre","Estoy cansada","Dame eso","Llévame"};

        for (int i = 0; i < ingles.length; i++) {
            // Esto está imprimiendo i como entero partiendo en 0
            // El .length es para contar y el i++ es el incremento uno en uno de i

            System.out.println(ingles[i] + ": " + espanol[i]);
        }

        /* Lo que se imprime en pantalla:

            Hello: Hola
            How are you?: ¿Cómo estás?
            Thanks: Gracias
            Bye: Adiós
            I wanna: Yo quiero
            Im hungry: Tengo hambre
            Im tired: Estoy cansada
            Im playing: Dame eso
            Give me that: Llévame
        */
    }
}
