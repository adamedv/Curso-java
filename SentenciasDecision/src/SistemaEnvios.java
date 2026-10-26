import java.util.Scanner;

public class SistemaEnvios {
    public static void main(String[] args) {
        System.out.println("*** Sistema de envíos ***");

        var consola = new Scanner(System.in);
        final var TARIFA_NACIONAL = 10;
        final var TARIFA_INTERNACIONAL = 20;

        System.out.print("Ingresa el destino del paquete (nacional/internacional): ");
        var destino = consola.nextLine().strip().toLowerCase();

        System.out.print("Ingrese el peso del paquete (Kg): ");
        var peso = Double.parseDouble(consola.nextLine());

        double total1;
        if(destino.equals("nacional")){
            total1 = TARIFA_NACIONAL * peso;
        }else if(destino.equals("internacional")){
            total1 = TARIFA_INTERNACIONAL * peso;
        }else {
            total1 = 0;
            destino = "No válido";
        }
        System.out.printf("""
                %nEl costo del envío del paquete %s es: $%.2f
                """,destino,total1);

        Double total = switch (destino){
            case "nacional" -> TARIFA_NACIONAL*peso;
            case "internacional" -> TARIFA_INTERNACIONAL*peso;
            default ->{
                System.out.println("Ingrese un valor válido (nacional o internacionl)");
                yield null;
            }
        };
        if (total!=null){
            System.out.printf("""
                    %nEl costo de su envío %s es $%.1f
                    """, destino,total);
        }
    }
}
