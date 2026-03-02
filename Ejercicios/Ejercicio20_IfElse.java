package Ejercicios;

import java.util.Scanner;

public class Ejercicio20_IfElse {
    public static void main(String[] args) {

        /*
        Un instituto de inglés desea informar a sus alumnos los días y horarios de sus clases.
        Para ello, decidió la creación de una aplicación que, a partir del ingreso de la edad del alumno,
        le informe en qué días y horarios los alumnos tienen clases.

        Como información, la academia proporciona los siguientes datos respecto a los grupos y los
        diferentes horarios:

        - kinder (de 4 a 6 años):
            lunes y miércoles de 16 a 17 hrs

        - 1st year (de 7 a 8 años):
            martes y jueves de 16:30 a 17:30 hrs

        -2do year (de 9 a 10 años):
            martes y jueves de 17:30 a 19 hrs

        -3rd year (de 11 a 13 años):
            lunes y miércoles de 17 a 18:30 hrs


        Realizar el programa solicitado por el instituto, donde a partir del ingreso de la EDAD del alumno,
        el sistema informe por pantalla los días y horarios de cursada.
         */

        System.out.println("Bienvenido a la escuela de inglés");

        int edad;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese la edad del alumno: ");
        edad = teclado.nextInt();


        // String horario;
        String kinder = "Lunes y miércoles de 16 a 17 hrs.";
        String firstYear = "Martes y jueves de 16:30 a 17:30 hrs.";
        String secondYear = "Martes y jueves de 17:30 a 19 hrs.";
        String thirdYear = "Lunes y miércoles de 17 a 18:30 hrs.";



        if(edad >= 4 && edad <= 6){ // kinder (de 4 a 6 años):
            System.out.println(kinder);
        } else if (edad >= 7 && edad <= 8) { // 1st year (de 7 a 8 años):
            System.out.println(firstYear);
        } else if (edad >= 9 && edad <= 10) { // 2do year (de 9 a 10 años):
            System.out.println(secondYear);
        } else if (edad >= 11 && edad <= 13) { // 3rd year (de 11 a 13 años):
            System.out.println(thirdYear);
        }
        else {
            System.out.println("Edad no válida o fuera de rango"); // edad inválida
        }

        teclado.close();
    }
}
