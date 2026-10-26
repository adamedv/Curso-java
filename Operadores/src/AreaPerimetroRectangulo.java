import java.util.Scanner;

public class AreaPerimetroRectangulo {
    public static void main(String[] args) {
        System.out.println("*** Área y Perímetro de un Rectángulo ***");
        var consola = new Scanner(System.in);

        System.out.print("Ingresa su altura: ");
        var altura = Integer.parseInt(consola.nextLine());

        System.out.print("Ingresa su base: ");
        var base = Integer.parseInt(consola.nextLine());

        System.out.println("El area del rectángulo es: " + (base*altura));
        System.out.println("El perímetro del rectángulo es: " + 2*(base+altura));
    }
}
