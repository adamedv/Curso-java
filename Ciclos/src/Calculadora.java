import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        System.out.println("*** Calculadora ***");
        var consola = new Scanner(System.in);
        var salir = false;
        double numero1 = 0, numero2 = 0, resultado;

        while(!salir){
            System.out.printf("""
                    Operaciones que puedes realizar:
                    1. Suma
                    2. Resta
                    3. Multiplicación
                    4. División
                    5. Salir
                    Escoge una opcion:\s
                    """);
            var opcion = consola.nextInt();

            if(opcion >= 1 && opcion <= 4){
                System.out.print("Dame el valor 1: ");
                numero1 = consola.nextDouble();
                System.out.print("Dame el valor 2: ");
                numero2 = consola.nextDouble();
            }

            switch (opcion) {
                case 1 -> {
                    resultado = numero1 + numero2;
                    System.out.println("Resultado: " + resultado);
                }
                case 2 -> {
                    resultado = numero1 - numero2;
                    System.out.println("Resultado: " + resultado);
                }
                case 3 -> {
                    resultado = numero1 * numero2;
                    System.out.println("Resultado: " + resultado);
                }
                case 4 -> {
                    if (numero2 != 0) {
                        resultado = numero1 / numero2;
                        System.out.println("Resultado: " + resultado);
                    }else{
                        System.out.print("Error: División entre 0\n");
                    }
                }
                case 5 ->{
                    salir = true;
                    System.out.println("Saliendo...");
                }
                default -> System.out.println("Opcion no valida");
            }

        }

    }
}
