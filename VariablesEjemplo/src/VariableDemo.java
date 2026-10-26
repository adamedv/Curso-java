
public class VariableDemo {
    public static void main(String[] args) {
        // Variables Primitivas
        int edad = 23;
        double salario = 15_000;
        char incial = 'A';
        boolean esEmplado = true;

        // Variable de Referencia
        String nombre = "Adair Medina";
        int[] numeros = {1,2,3,4,5};

        // Uso de ver
        var mensaje = "Bienvenido a Java";
        var numero = 100;

        // Imprimir valores
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Salario: " + salario);
        System.out.println("Inicial: " + incial);
        System.out.println("Es empleado: " + esEmplado);
        System.out.println("Mensaje: " + mensaje);
        System.out.println("Número: " + numero);

    }
}