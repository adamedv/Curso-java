public class Concatenacion {
    public static void main(String[] args) {
        // Operador +
        String saludo = "Hola";
        String nombre = "Mundo";
        String mensaje = saludo + ", " + nombre + "!";
        System.out.println(mensaje);

        // Multiples tipos
        String mensaje1 = "El resultado es ";
        int numero1 = 5;
        int numero1_1 = 4;
        String resultado = mensaje1 + numero1 + "+" + numero1_1
                + " es " + (numero1 + numero1_1);
        System.out.println(resultado);
    }
}
