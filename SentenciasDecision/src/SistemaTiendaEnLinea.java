import java.util.Scanner;

public class SistemaTiendaEnLinea {
    public static void main(String[] args) {
        System.out.println("*** Tienda en Linea con Descuentos ***");
        var consola = new Scanner(System.in);
        var descuento = 0;

        System.out.print("Ingrese el monto de su compra: ");
        var montoCompra = Double.parseDouble(consola.nextLine());

        System.out.print("Eres miembro de la tienda (true/false): ");
        var isMiembro = Boolean.parseBoolean(consola.nextLine());

        if(montoCompra>1000 && isMiembro){
            descuento = 10;
            var montoDescuento = (montoCompra*descuento)/100;
            var total = montoCompra - montoDescuento;
            System.out.printf("""
                %nFelicidades, has obtenido un descuento de %%%d
                Monto de la compra = $%.2f
                Monto del descuento= $%.2f
                Monto final de la compra con descuento: $%.2f
                """,descuento,montoCompra,montoDescuento,total);
        } else if(isMiembro){
            descuento = 5;
            var montoDescuento = (montoCompra*descuento)/100;
            var total = montoCompra - montoDescuento;
            System.out.printf("""
                %nFelicidades, has obtenido un descuento de %%%d
                Monto de la compra = $%.2f
                Monto del descuento= $%.2f
                Monto final de la compra con descuento: $%.2f
                """,descuento,montoCompra,montoDescuento,total);
        }else {
            System.out.printf("""
                    %nNo obtuviste ningún descuento
                    Te invitamos a convertirte en miembro de la tienda
                    Monto final de la compra: $%.2f
                    """,montoCompra);
        }
    }
}
