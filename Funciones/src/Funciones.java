import java.util.Scanner;

public class Funciones {

    static void saluda(String mensaje){
        System.out.println(mensaje);
    }

    public static void main(String[] args) {
        saluda("Hola Mundo, desde Java");
        saluda("adios tonotos");

        var consola = new Scanner(System.in);

        System.out.println("Ingresa un mensaje: ");
        var mensaje  = consola.nextLine();
        saluda(mensaje);

    }
}
