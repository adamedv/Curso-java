import java.util.Scanner;

public class SistemaPrestamoLibros {
    public static void main(String[] args) {
        System.out.println("*** Sistema Prestamo de Libros ***");
        var consola = new Scanner(System.in);
        final var maxKm = 3;

        System.out.print("¿Tiene creencial de estudiante? (true/false): ");
        var hasCredencial = Boolean.parseBoolean(consola.nextLine());

        System.out.print("¿A cuántos Km a la redonda vive?: ");
        var km = Integer.parseInt(consola.nextLine());

        var prestamo = hasCredencial || km <= maxKm;
        System.out.println("¿Se le puede pestar libros?: " + prestamo);
    }
}
