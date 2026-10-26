import java.util.Scanner;

public class SistemaEmpleados {
    public static void main(String[] args) {
        System.out.println("*** Sistema de empleados ***");
        var consola = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        var nombre  = consola.nextLine();
        System.out.print("Ingrese su edad: ");
        var edad  = consola.nextLine();
        System.out.print("Ingrese su salario: ");
        var salario  = consola.nextLine();
        System.out.print("Es jefe de departamento : ");
        var esJefe  = consola.nextLine();

        System.out.println("Nombre: " + nombre);

        var edadInt = Integer.parseInt(edad);
        System.out.println("Edad: " + edadInt);

        var salariodouble = Double.parseDouble(salario);
        System.out.println("Salario: " + salariodouble);

        var esJefeBoolean = Boolean.parseBoolean(esJefe);
        System.out.println("Es jefe de departamento (true/false)  = " + esJefeBoolean);



    }

}
