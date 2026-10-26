import java.util.Scanner;

public class MeyorDosNumeros {
    public static void main(String[] args) {
        System.out.println("*** Mayor de dos números ***");
        var consola = new Scanner(System.in);

        System.out.println("Ingresa número 1 (entero): ");
        var numero1 = Integer.parseInt(consola.nextLine());

        System.out.println("Ingresa número 2 (entero): ");
        var numero2 = Integer.parseInt(consola.nextLine());

        if(numero1>numero2){
            System.out.printf("El número 1: '%d' es mayor",numero1);
        } else if (numero1==numero2){
            System.out.printf("Los números son iguales");
        }else{
            System.out.printf("El número 2:  '%d' es mayor",numero2,numero1);
        }

    }
}
