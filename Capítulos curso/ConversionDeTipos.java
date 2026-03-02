package CapitulosCurso;

public class ConversionDeTipos {
    public static void main(String[] args) {

        String numeroStr = "50";
        int numeroInt = Integer.parseInt(numeroStr);
        System.out.println("numeroInt = " + numeroInt);

        String realStr = "9876543e-3";
        double realDouble = Double.parseDouble(realStr);
        System.out.println("realDouble = " + realDouble);

        String logicoStr = "False";
        boolean logicoBoolean = Boolean.parseBoolean(logicoStr);
        System.out.println("logicoBoolean = " + logicoBoolean);



//---------- A continuación pasaremos a hacer todo lo opuesto. Convertíamos un tipo string a uno primitivo
// ---------ahora pasaremos de tipo primitivo a tipo String.


        int otroNumeroInt = 100;
        System.out.println("otroNumeroInt = " + otroNumeroInt);


        String otroNumeroStr = Integer.toString(otroNumeroInt);
        System.out.println("otroNumeroStr = " + otroNumeroStr);


        // otroNumeroStr = String.valueOf(otroNumeroStr+10); // le voy a sumar 10. Copia el número Int y le concatena 10
        otroNumeroStr = String.valueOf(otroNumeroInt+10); // mas le voy a sumar 10. Súma 10 al número Str
        System.out.println("otroNumeroStr = " + otroNumeroStr);


        double otroRealDouble = 1.23456;
        String otroRealStr = Double.toString(otroRealDouble);
        System.out.println("otroRealStr = " + otroRealStr);




    }
}
