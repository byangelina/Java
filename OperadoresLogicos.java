package CapitulosCurso;

public class OperadoresLogicos {
    public static void main(String[] args) {



        int i = 3;
        byte j = 7;
        float k = 127e-7f;
        double l = 2.1413e3;
        boolean m = false;



        boolean b1 = i == j && k < l && m == false; // con && si una falla todas fallan, por eso es false
        System.out.println("b1 = " + b1);

        boolean b2 = i == j || k > l; // con || o conocido como "or", si al menos uno se cumple, todos cumplen
        System.out.println("b2 = " + b2);

        boolean b3 = i == j && k > l || m == false; // si al menos una expresión se cumplen con el || "or", todo se cumple
        System.out.println("b3 = " + b3);

    }

}
