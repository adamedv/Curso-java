public class DetalleLibro {
    public static void main(String[] args) {
        //Detalle de un libro
        String tituloLibro = "El señor de los anillos";
        int anioPublicacion = 1963;
        boolean libroDisponible = true;
        double precio =  500.50;
        //Imprimir valor variables
        System.out.println("Titulo: "+ tituloLibro);
        System.out.println("Año Publicación : "+ anioPublicacion);
        System.out.println("Disponible : "+ libroDisponible);
        System.out.println("Prcio: "+ precio);
        //Modificar titulo libro
        tituloLibro = "El Señor de los Anillos";
        System.out.println("Titulo: "+ tituloLibro);

    }
}
