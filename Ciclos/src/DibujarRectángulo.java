import java.util.Scanner;

public class DibujarRectángulo {
    public static void main(String[] args) {
        System.out.println("*** Dibujar Triángulo ***");
        var consola = new Scanner(System.in);

        System.out.print("Ingresa el numero de filas del triángulo:");
        var numeroFilas = Integer.parseInt(consola.next());

        for (int fila = 1;fila<=numeroFilas;fila++){
            var espaciosBlanco = " ".repeat(numeroFilas-(fila));
            var asteriscos = "*".repeat(2*fila-1);
            System.out.println(espaciosBlanco + asteriscos);

        }
    }
}
