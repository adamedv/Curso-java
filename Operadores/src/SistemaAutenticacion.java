import java.util.Scanner;

public class SistemaAutenticacion {
    public static void main(String[] args) {
        System.out.println("*** Sistema de auntenticación ***");
        var consola = new Scanner(System.in);
        var usuario = "adairmed09";
        var contrasena = "chess123";

        System.out.print("¿Cuál es su usuario?: ");
        var usuarioIngresado = consola.next();

        System.out.print("¿Cuál es su contraseña?: ");
        var contrasenaIngresada = consola.next();

        var ingreso = (usuarioIngresado.equals(usuario)) && (contrasenaIngresada.equals(contrasena));
        System.out.print("¿Los datos son correctos?: " + ingreso);

    }
}
