import java.util.Scanner;

public class MenuIterativo {
    public static void main(String[] args) {
        System.out.println("*** Menu Iterativo ***");
        var consola = new Scanner(System.in);
        var salir = false;

        do {
            System.out.printf("""
                Menú:
                1. Crear cuenta
                2. Eliminar cuenta
                3. Salir
                
                Escoje una opcion:""");
            var opcion = Integer.parseInt(consola.next());
            switch (opcion) {
                case 1 -> System.out.println("Creando una cuenta...");
                case 2 -> System.out.println("Eliminando un cuenta...");
                case 3 -> {
                    System.out.println("Saliendo...");
                    salir = true;
                }
                default -> System.out.println("Opcion no valida");
            }
        }while (!salir);
        System.out.println("Fin del sistema de administracion de cuentas");
    }
}
