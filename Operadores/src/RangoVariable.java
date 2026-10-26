import java.util.Scanner;

public class RangoVariable {
    public static void main(String[] args) {
        System.out.println("Proporciona un dato entero: ");
        var numero = Integer.parseInt(new Scanner(System.in).nextLine());

        var dentroRango = numero >= 1 && numero <= 10;
        var fueraRango = !(numero >= 1 && numero <= 10);

        System.out.println("¿Esta dentro del rango? (1-10): " + dentroRango);
        System.out.println("¿Esta fuera del rango? (1-10): " + fueraRango);
    }
}
