import java.util.Scanner;

public class FuncionSumar {

    static double sumar(double numero1, double numero2){
        return numero1 + numero2;
    }

    public static void main(String[] args) {
        System.out.println("*** Funcion sumar ***");
        var consola = new Scanner(System.in);
        System.out.print("Ingresa un numero (1): ");
        var numero1 = consola.nextDouble();
        System.out.print("Ingresa un numero (2): ");
        var numero2 = consola.nextDouble();

        double resultado = sumar(numero1,numero2);
        System.out.printf("Resultado de suma %.2f + %.2f: %.2f",numero1,numero2,resultado);

    }
}
