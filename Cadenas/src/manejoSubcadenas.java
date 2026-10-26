public class manejoSubcadenas {
    public static void main(String[] args) {
        // Tema de subcadenas
        var cadena1 = "Hola mundo";
        System.out.println("Cadena 1: " + cadena1);

        //Subcadena
        var subcadena1 = cadena1.substring(0, 4);
        System.out.println("Subcadena1 = " + subcadena1);

        //var subcadena2 = cadena1.substring(5);
        var subcadena2 = cadena1.substring(6,9);
        System.out.println("Subcadena2 = " + subcadena2);

    }
}
