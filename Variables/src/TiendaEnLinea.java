public class TiendaEnLinea {
    public static void main(String[] args) {
        System.out.println("*** Tienda en Línea (Detalles de un producto) ***");

        //Detalles del producto
        String nombreProducto = "Miel";
        double precio = 110.5;
        int cantidadDisponible = 20;
        boolean estaDisponible = true;

        //Imprimir el detalle del producto
        System.out.println("Nombre producto = " + nombreProducto);
        System.out.println("Precio = $" + precio);
        System.out.println("Cantidad disponible = " + cantidadDisponible);
        System.out.println("Esta disponible? = " + estaDisponible);

        System.out.println();
        //Modificar los valores
        nombreProducto = "Miel virgen";
        precio = 210.5 ;
        cantidadDisponible = 0;
        estaDisponible = false;

        //Imprimir el detalle del producto
        System.out.println("Nombre producto = " + nombreProducto);
        System.out.println("Precio = $" + precio);
        System.out.println("Cantidad disponible = " + cantidadDisponible);
        System.out.println("Esta disponible? = " + estaDisponible);
    }
}
