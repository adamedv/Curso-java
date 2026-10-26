import java.util.Scanner;
import java.util.Random;

public class GeneradorIDUnico {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        System.out.print("Cuál es tu nombre?: ");
        var nombre = consola.nextLine();

        System.out.print("Cuál es tu apellido?: ");
        var apellido = consola.nextLine();

        System.out.print("Cuál es su año de nacimiento (YYYY) ?: ");
        var nacimiento = consola.next();

        var nombre2 = nombre.trim().toUpperCase().substring(0,2);
        var apellido2 = apellido.trim().toUpperCase().substring(0,2);
        var nacimiento2 = nacimiento.trim().substring(2,4);

        var random = new Random();
        var numeroAleatorio = random.nextInt(9999) + 1;
        var numeroFormateado = String.format("%04d", numeroAleatorio);

        var ID = (nombre2 + apellido2 + nacimiento2 + numeroFormateado);


        System.out.printf("""
                %nHola %s
                \tTu nuevo numero de identificación (ID) generado por el sistema es:
                \t%s
                \tFelicidades!!!! 
                """,nombre,ID);
    }
}
