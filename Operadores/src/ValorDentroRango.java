import java.util.Scanner;

public class ValorDentroRango {
    public static void main(String[] args) {
        final int minimo = 0, maximo = 5;

        System.out.print("Ingresa un valor dentro de 0 y 5: ");
        var valor = Integer.parseInt(new Scanner(System.in).nextLine());

        var rango = valor >= minimo && valor <= maximo;
        System.out.println("Esta dentro del rango?: " + rango);
    }
}
