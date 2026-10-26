
public class metodosString {
    public static void main(String[] args) {
        String mensaje = "Bienvenido a Java";
        System.out.println("Mensaje = " + mensaje);

        // Obtener la longitud de la cadena
        int longitud = mensaje.length();
        System.out.println("Longitud: " + longitud);

        // Convertir a mayúsculas
        String mayusculas = mensaje.toUpperCase();
        System.out.println("Mayúsculas: " + mayusculas);

        // Subcadena
        String subcadena = mensaje.substring(13);
        System.out.println("Subcadena: " + subcadena);

        // Reemplazar caracteres
        String reemplazada = mensaje.replace("Java", "el curso");
        System.out.println("Reemplazada: " + reemplazada);
    }
}