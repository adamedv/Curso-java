import java.util.Scanner;

public class CreacionValidacionPassword {
    public static void main(String[] args) {
        System.out.println("*** Creacion y Validacion de Password ***");
        var consola = new Scanner(System.in);

        System.out.print("Crea una contraseña con al menos 6 caracteres: ");
        String password = consola.nextLine();

        while (password.length() < 6) {
            System.out.println("Inténtalo de nuevo");
            System.out.print("Crea una contraseña con al menos 6 caracteres: ");
            password = consola.nextLine();
        }

        System.out.println("Contraseña creada valida");
    }
}
