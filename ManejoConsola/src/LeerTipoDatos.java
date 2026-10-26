import java.util.Scanner;

public class LeerTipoDatos {
    public static void main(String[] args) {
        // Leer distintos tipos de datos
        //Tipo int
        var consola = new Scanner(System.in);
        System.out.print("Ingresa tu edad: ");
        var edad = consola.nextInt();
        System.out.println("Edad = " + edad);

        //Tipo double
        System.out.print("Ingresa tu altura: ");
        var altura = consola.nextDouble();
        System.out.println("Altura: " + altura);

        //Tipo boolean
        System.out.print("Introduce un valor booleano (true/false): ");
        var valorBooleano = consola.nextBoolean();
        System.out.println("El valor booleano (treu/false):" + valorBooleano);

        //Con los métodos int y double no dan salto de linea en automatico
        //Consumimos caracter de salto de linea
        consola.nextLine();

        //Tipo String
        System.out.print("Ingresa tu nombre: ");
        var nombre =  consola.nextLine();
        System.out.println("Nombre: " + nombre);

        //Conversión de datos
        //String a int
        System.out.print("Proporciona un valor entero: ");
        var enteroString = consola.nextLine();
        var entero = Integer.parseInt(enteroString);
        System.out.println("Varibale entero: " + entero);

        //String a flotante
        System.out.print("Proporciona un valor flotante: ");
        var flotante = Float.parseFloat(consola.nextLine());
        System.out.println("Flotante: " + flotante);

        //String a double
        System.out.print("Propociona un valor double: ");
        var doble = Double.parseDouble((consola.nextLine()));
        System.out.println("Double: " + doble);

    }
}
