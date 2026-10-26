import java.util.Scanner;

public class SistemaBancario {
    public static void main(String[] args) {
        System.out.println("*** Sistema Bancario ***");
        var consola = new Scanner(System.in);

        System.out.print("Desea salir del sistema bancario (true/false): ");
        var isContinuar = Boolean.parseBoolean(consola.nextLine());

        if (!isContinuar){
            System.out.println("Continuamos dentro del sistema...");
        }else{
            System.out.println("Saliendo del sistema...");

        }
    }
}
