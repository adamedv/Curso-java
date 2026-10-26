public class busquedaSubcadenas {
    public static void main(String[] args) {
        // Buscar subcadenas

        //indexOf - Devuelve el indice de la prmiera aparicion de la subcadena
        var cadena = "Hola Mundo";

        // Subcadena a buscar "Hola"
        var indice1 = cadena.indexOf("Hola");
        System.out.println("Indice 1 = " + indice1);

        // Subcadena de "Mundo"
        var indice2 = cadena.lastIndexOf("Mundo");
        System.out.println("Indice 2 = " + indice2);

        // Subcadena no encontrada
        var indice3 = cadena.lastIndexOf("Java");
        System.out.println("Indice 3 = " + indice3);
    }
}
