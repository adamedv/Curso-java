import java.util.Scanner;

public class SistemaEmpleados_2 {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);

        //Nombre del empleado
        System.out.println("Nombre del empleado: ");
        var nombre = consola.nextLine();

        //Edad del empleado
        System.out.println("Edad del empleado");
        var edad = Integer.parseInt(consola.nextLine());

        //Salario del empleado
        System.out.println("Salario: ");
        var salario = Double.parseDouble(consola.nextLine());

        //Es jefe de departamento
        System.out.println("Es jefe de departamento (true/false): ");
        var esJefe = Boolean.parseBoolean(consola.nextLine());

        //Imprimir resultados
        System.out.println("\nDatos del empleadp = ");
        System.out.println("\tNombre: " + nombre);
        System.out.println("\tEdad = " + edad);
        System.out.println("\tSalario = " + salario);
        System.out.println("\tSalario = $ %.2f".formatted(salario));
        System.out.println("\tEs jefe de departamento: " + esJefe);
    }
}
