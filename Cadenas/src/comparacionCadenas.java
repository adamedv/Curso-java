public class comparacionCadenas {
    public static void main(String[] args) {
        // Comparación de cadena
        var cadena1 = "Java";
        var cadena_2 = "Java";
        var cadena_3 = new String("Java");

        // Comparación de cadenas (==) comparan la referencia
        System.out.print("Cadena 1 es igual en referencia a cadena 2: ");
        System.out.println(cadena1 == cadena_2);
        // Comparamos cadena 1 con cadena 3 en referencia
        System.out.print("Cadena 1 es igual en referencia a cadena 3: ");
        System.out.println(cadena1 == cadena_3);

        System.out.println("----------------------------------------");

        //Comparar contenido con metodo equals en CONTENIDO
        System.out.print("Cadena 1 es igual en CONTENIDO a cadena 3: ");
        System.out.println(cadena1.equals(cadena_3));

        System.out.print("Cadena 1 es igual en CONTENIDO a cadena 2: ");
        System.out.println(cadena1.equals(cadena_2));

    }
}
