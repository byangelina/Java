package CapitulosCurso;

import javax.lang.model.element.NestingKind;

public class OperadoresAsignacion {
    public static void main(String[] args) {


        // operador de asignación

        int i = 5;
        int j = i + 4; // ahora vale 9
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        i = i + 2; // ahora vale 7
        System.out.println("i = " + i);

        i += 5; // ahora vale 12
        System.out.println("i = " + i);

        j -= 4; // es lo mismo que j= j-4 ---> j valía 9, asi que 9-4 ahora es 5.
        System.out.println("j = " + j);

        i *= 3; // i valía 5 asi que 3*5 ahora i = 15.
        System.out.println("j = " + j);

        // estas son consultas sql como ejemplo, se explicará más adelante.
        String sqlString = "select * from clientes as c"; // CONSULTA SQL: "traeme todos los registros de la tabla clientes, alias c"
        sqlString += " where c.nombre='Andres'";
        sqlString += " and c.activo=1";
        System.out.println("sqlString = " + sqlString);


    }
}