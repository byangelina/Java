package Apuntes;

import javax.swing.*;

public class Ejercicio1 {
    public static void main(String[] args) {



        // Mostrar mensaje
        String mensajeAmorcito = "Hola mi amor!";
        JOptionPane.showMessageDialog(null,mensajeAmorcito);


        // Pedir respuesta
        String respuestaAmorcito = JOptionPane.showInputDialog("Responder: ");



        // Mostrar lo que escribió el usuario
        JOptionPane.showMessageDialog(null, "Escribiste: " + respuestaAmorcito); // El primero es null (significa "sin ventana padre")





    // estas son las llaves finales del programa
    }
}
