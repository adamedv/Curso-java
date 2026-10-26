public class metodosCadenas {
    public static void main(String[] args) {
        var cadena1 = "Hola mundo";
        System.out.println("Cadena: " + cadena1);

        //Longitud de la cadena
        var longitud = cadena1.length();
        System.out.println("Longitud: " + longitud);

        //Reemplazo de caracteres en una cadena
        var reemplazoCaracteres = cadena1.replace('o','a');
        System.out.println("Cadena modificada: " + reemplazoCaracteres);

        //A mayusculas y minusculas
        String mayusculas = cadena1.toUpperCase();
        System.out.println("Mayusculas: " + mayusculas);
        var minusculas = cadena1.toLowerCase();
        System.out.println("Minusculas: " + minusculas);

        //Eliminar espacios al inicio y al final
        var cadena2 = "   Adair Medina         ";
        System.out.println("Cadena 2 sin modificación: " + cadena2);
        System.out.println("Cadena 2 sin espacios: " + cadena2.trim());

    }
}
