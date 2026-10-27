import java.util.Scanner;

public class CajeroAutomatico {
    public static void main(String[] args) {
        System.out.println("*** Cajero Automático ***");
        var consola = new Scanner(System.in);
        double dinero = 1000;
        var salir =  false;
        double retiroDeposito = 0;

        do{
            System.out.print("""
                    \nOperaciones que puedes realizar:
                    1. Consultar saldo
                    2. Retirar
                    3. Depositar
                    4. Salir
                    Escoge una opcion:
                    """);
            var opcion = Integer.parseInt(consola.next());

            switch (opcion){
                case 1 -> System.out.printf("Tu saldo: $%.0f",dinero);
                case 2 -> {
                    System.out.print("Ingrese la cantidad a retirar: ");
                    retiroDeposito = Double.parseDouble(consola.next());
                    if (retiroDeposito <= dinero){
                        //dinero = dinero - retiroDeposito;
                        dinero -= retiroDeposito;
                        System.out.println("Saldo actual: $" + dinero);
                    }else {
                        System.out.println("Fondos insuficientes");
                    }
                }
                case 3 -> {
                    System.out.print("Ingrese la cantidad a depositar: ");
                    retiroDeposito = Double.parseDouble(consola.next());
                    //dinero = dinero + retiroDeposito;
                    dinero += retiroDeposito;
                    System.out.println("Saldo actual: $" + dinero);
                }
                case 4 -> {
                    salir = true;
                    System.out.println("Saliendo...");
                }
                default -> System.out.println("Opcion no valida");
            }
        }while (!salir);

    }
}
