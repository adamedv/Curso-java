public class BreakYContinue {
    public static void main(String[] args) {
        System.out.println("*** Break Y Continue ***");

        //Ejemplo break imprimir el primer numero par
        System.out.println("Palabra break: ");
        for(var numero = 1;numero < 10; numero++){
            if(numero % 2 == 0){
                System.out.print(numero + " ");
                break;
            }
        }

        //Ejemplo continue, imprimir solo numeros pares
        System.out.println("\nPalabra continue: ");
        for(var numero = 1;numero < 10; numero++){
            if(numero % 2 == 1){
                continue;
            }
            System.out.print(numero + " ");
        }
    }
}
