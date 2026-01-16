package CapitulosCurso;
import javax.swing.*;

public class SistemasNumericos {
static void main(String[] args) {

    // aqui creare una ventana de dialogo, donde hay que responder un input con --> JOptionPane.showInputDialog()
    String numeroStr = JOptionPane.showInputDialog(null,"Ingrese un número entero"); //el JOptionPane.showInpuntDialog es para abrir una ventana con un mensaje

    // aqui creare un try catch para errores
    int numeroDecimal = 0; // este se inicializa en 0, y en el try se le asigna un valor
    try {
        numeroDecimal = Integer.parseInt(numeroStr); // convierte un numero en un string
    } catch (NumberFormatException e){
        JOptionPane.showMessageDialog(null, "Error, debe ingresar un numero entero");
        main(args); // se agrega --> main() porque... no sé, se explica mas adelante (es mas avanzado)
        System.exit(0); // esto se hace para finalizar el programa
        //ojo, si nunca escribo lo que me pide el input, el bucle se repite hasta que haga lo que me pidio, no se puede cancelar
    }



    String resultadoBinario = "numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
    System.out.println(resultadoBinario);


    int numeroBinario = 0b11110;
    System.out.println("numeroBinario = " + numeroBinario); // para imprimir el valor de un numero binario se antepone 0b antes del numero binario (de la variable)


    String resultadoOctal = "numero octal de " + numeroBinario + " = " + Integer.toOctalString(numeroDecimal);
    System.out.println(resultadoOctal);
    int numeroOctal = 036; //para imprimir el valor de un número octal se antepone un 0 antes del valor del numero octal.
    System.out.println("numeroOctal = " + numeroOctal);


    String resultadoHex = "numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);
    System.out.println(resultadoHex);

    int numeroHex = 0x1e; //para imprimir el valor de un numero hexadecimal se antepone 0x antes del numero
    System.out.println("numeroHex = " + numeroHex);


    // aqui crearemos una ventana que muestre un mensaje con --> JOptionPane.showMessageDialog();
    // primero crear la variable mensaje y concatenar con diferentes mensajes
    String mensaje = resultadoBinario;
    mensaje += "\n" + resultadoOctal; // esta es una concatenación. se tomo el String y lo concateno a la variable mensaje. es como decir -- > mensaje = mensaje + .... asi.
    mensaje += "\n" + resultadoHex;

    // \n es el salto de linea
    JOptionPane.showMessageDialog(null, mensaje);

}
        }





