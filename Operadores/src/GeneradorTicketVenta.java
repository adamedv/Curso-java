import java.util.Scanner;

public class GeneradorTicketVenta {
    public static void main(String[] args) {
        System.out.println("*** Generador Ticket de Venta ***");
        var consola = new Scanner(System.in);

        System.out.println("Ingresa el precio de cada producto: ");
        System.out.print("Precio de miel: ");
        var mielPrecio = Double.parseDouble(consola.nextLine());

        System.out.print("Precio pan: ");
        var panPrecio = Double.parseDouble(consola.nextLine());

        System.out.print("Precio galletas: ");
        var galletasPrecio = Double.parseDouble(consola.nextLine());

        System.out.println("Descuendo que desee aplicar (%): ");
        var porcentajeDescuento = Integer.parseInt(consola.nextLine());
//        var descuento = Double.parseDouble(consola.nextLine()); Usando valores double

        var subTotal = mielPrecio + panPrecio + galletasPrecio;

        var descuento = (subTotal * porcentajeDescuento)/100;

        var descuentoAplicado = subTotal - descuento;

//        var descuentoAplicado = (subTotal) * (descuento/100); Al dividir entre 100 valores int da 0
//
//        var subTotalDescuento = (subTotal) * ((100-descuento)/100);

        var interes = descuentoAplicado * .16;

        var totalCompra = descuentoAplicado + interes;
        System.out.printf("""
                %nTicket de venta
                ---------------------
                Subtotal: $%.2f
                Descuento: $%.2f (%d%%)
                Impuesto (16%%): $%.2f
                Total: $%.2f
                """,subTotal,descuento,porcentajeDescuento,interes,totalCompra);
//        Descuento: %.0f%% - $%.2f

    }
}
