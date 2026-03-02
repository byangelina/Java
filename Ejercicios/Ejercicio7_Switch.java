package Ejercicios;

public class Ejercicio7_Switch {

    public static void main(String[] args) {

        //cómo usar SWITCH
        // switch significa cambiar

        //lo que hace este programa es que, dependiendo del numero de dia, se va a imprimir el nombre del día, por ejemplo dia:9 es viernes...
        //el switch contiene diferentes alternativas con valores, si deseo imprimir algo lo tomo del switch.

        int dia = 9;
        String nombreDia;

        switch (dia){

            case 1: nombreDia = "lunes";
            break;
            case 2: nombreDia = "martes";
            break;
            case 3: nombreDia = "miércoles";
            break;
            case 4: nombreDia = "jueves";
            break;
            case 5: nombreDia = "viernes";
            break;
            case 6: nombreDia = "sábado";
            break;
            case 7: nombreDia = "domingo";
            break;
            default: nombreDia = "numero de día inválido"; //esta es una opción por defecto en caso de que el usuario ponga otra opción que no esta en las alternativas.
            break;

        }
        System.out.println("El día de la semana seleccionado es: " + nombreDia);




    }

}
