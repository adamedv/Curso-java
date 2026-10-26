public class ReservaHotel {
    public static void main(String[] args) {
        String nombreCliente = "Adair";
        int diasEstancia = 3;
        int tarifaDiaria = 700;
        boolean esVistaMar = true;

        System.out.println("*** Sistema de reserva de hoteles ***");
        System.out.println("Nombre del cliente = " + nombreCliente);
        System.out.println("Dìas de estancia = " + diasEstancia);
        System.out.println("Tarifa Diaria = " + tarifaDiaria);
        System.out.println("Vista al mar = " + esVistaMar);

        System.out.println("\nNuevos datos: ");
        //Nuevos datos
        diasEstancia = 5;
        tarifaDiaria = 350;
        esVistaMar = false;

        System.out.println("Nombre del cliente = " + nombreCliente);
        System.out.println("Dìas de estancia = " + diasEstancia);
        System.out.println("Tarifa Diaria = " + tarifaDiaria);
        System.out.println("Vista al mar = " + esVistaMar);



    }
}
