import java.util.Scanner;

public class AppSaludFitness {
    public static void main(String[] args) {
        System.out.println("*** Salud y Fitness ***");
        var consola = new Scanner(System.in);
        final var META_PASOS_DIARIOS = 10_000;
        final var CALORIAS_POR_PASO = 0.04;

        System.out.println("Ingresa nombre de usuario: ");
        var usuario = consola.nextLine();

        System.out.println("Ingresa los pasos caminados en el día: ");
        var pasos = Integer.parseInt(consola.nextLine());

        var caloriasQuemadas = pasos * CALORIAS_POR_PASO;

        var resultado = (pasos>=META_PASOS_DIARIOS) ? "Si" : "No";
        System.out.printf("""
                /nUsuario: %s
                Pasos de hoy: %d
                Calorias quemadas: %.2f Kc
                Meta de pasos diarios alcanzada: %s
                ---------------------------------------
                La meta de los pasos diarios es: %d
                """,usuario,pasos,caloriasQuemadas,resultado,META_PASOS_DIARIOS);
    }
}
