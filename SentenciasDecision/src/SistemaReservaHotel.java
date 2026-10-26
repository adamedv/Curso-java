import java.util.Scanner;

public class SistemaReservaHotel {
    public static void main(String[] args) {
        System.out.println("*** Sistema Reserva de Hotel ***");
        final var CUARTO_VISTA_MAR = 190.50;
        final var CUARTO_NO_VISTA_MAR = 150.50;
        var consola = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        var nombreCliente = consola.nextLine();

        System.out.print("¿Cuántos días se hospedará?: ");
        var diasHospedaje = Integer.parseInt(consola.nextLine());

        System.out.print("¿Cuarto con vista al mar?(true/false): ");
        var hasVistaMar = Boolean.parseBoolean(consola.nextLine());

        //Costo y si tiene vista al mar o no
        var costo = (hasVistaMar) ? CUARTO_VISTA_MAR : CUARTO_NO_VISTA_MAR ;

        var total = costo * diasHospedaje;

        System.out.printf("""
                \n---------- Detalles reservación ----------
                \tCliente: %s
                \tDías de estadía: %d
                \tCosto total de la habitación: $%.2f
                \tHabitación con vista al mar: %s
                """,nombreCliente,diasHospedaje,total,(hasVistaMar) ? "Si" : "No");

    }
}
