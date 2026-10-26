import java.util.Scanner;

public class RecetaCocina {
    public static void main(String[] args) {
        System.out.println("*** Receta de Cocina ***");
        var consola = new Scanner(System.in);

        System.out.print("Ingresa el nombre: ");
        var nombre = consola.nextLine();

        System.out.print("Ingresa los ingredientes: ");
        var ingredientes = consola.nextLine();

        System.out.print("Ingresa el tiempo en minutos: ");
        var tiempoMin = Integer.parseInt(consola.nextLine());

        System.out.print("Ingresa dificultad (Facil/Media/Alta): ");
        var dificultad = consola.next();

        System.out.println("--- Receta de cocina ---");
        System.out.println("Nombre receta: " + nombre);
        System.out.println("Ingredientes = " + ingredientes);
        System.out.println("Tiempo de preparación = " + tiempoMin);
        System.out.println("Dificultad = " + dificultad);

    }
}
