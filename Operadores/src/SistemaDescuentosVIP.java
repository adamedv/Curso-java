import java.util.Scanner;

public class SistemaDescuentosVIP {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        final var mininmoArticulos = 10;
        System.out.println("*** Sistema Descuentos VIP ***");
        System.out.print("¿Cuántos artículos ha comprado?: ");
        var articulos = Integer.parseInt(consola.nextLine());
        System.out.print("¿Cuenta con membresía? (true/flase): ");
        boolean hasmembresia = consola.nextBoolean();

        var accesoDescuento = (articulos >= mininmoArticulos) && (hasmembresia);
        //hasmembresia ya es booleana entonces por ende es true o false
        System.out.println("¿Cuenta con acceso al descuento?: " + accesoDescuento);
    }
}
