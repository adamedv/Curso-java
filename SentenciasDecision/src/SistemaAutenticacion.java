import java.util.Scanner;

public class SistemaAutenticacion {
    public static void main(String[] args) {
        System.out.println("*** Sistema de Autenticasión ***");
        var consola = new Scanner(System.in);

        final var USUARIO = "adairmed";
        final var CONTRASENA = "asdf";

        System.out.print("Ingresa el usuario: ");
        var usuarioIngresado = consola.nextLine();

        System.out.print("Ingresa la contraseña: ");
        var contrasenaIngresada = consola.nextLine();

        if (usuarioIngresado.equals(USUARIO) && contrasenaIngresada.equals(CONTRASENA)) {
            System.out.println("Bienvenido al sistema");
        } else if (usuarioIngresado.equals(USUARIO)) {
            System.out.println("Contraseña inválida");
        } else if (contrasenaIngresada.equals(CONTRASENA)) {
            System.out.println("Usuario inválido");
        } else {
            System.out.println("Usuario y contraseña inválidos");
        }

        String mensajeVaidacion;
        mensajeVaidacion = switch (usuarioIngresado) {
            case USUARIO -> {
                if (CONTRASENA.equals(contrasenaIngresada)) {
                    yield "Bienvenido al sistema";
                } else {
                    yield "Contraseña inválida";
                }
            }
            default -> {
                if (CONTRASENA.equals(contrasenaIngresada)) {
                    yield "Usuario inválido";
                } else {
                    yield "Usuario y contraseña inválidos";
                }

            }
        };
        System.out.println(mensajeVaidacion);
    }
}
