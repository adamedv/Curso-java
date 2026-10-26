public class reemplazarSubcadenas {
    public static void main(String[] args) {
        // Reemplazar subcadenas
        var cadena = "Hola mundo";
        System.out.println("Cadena original: " + cadena);

        // Reemplazar "mundo" por "a todos"
        var nuevaCadena1 = cadena.replace("mundo","a todos");
        System.out.println("Nueva Cadena 1 = " + nuevaCadena1);

        // Reemplazar "Hola" por "Adios"
        System.out.println("Nueva Cadena 2 = " + cadena.replace("Hola","Adios"));


    }
}
