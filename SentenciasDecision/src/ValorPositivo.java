import java.util.Scanner;

public class ValorPositivo {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);

        System.out.print("Ingresa un numero: ");
        var numero = Double.parseDouble(consola.nextLine());

        if (numero>0){
            System.out.printf("Es positivo: %f",numero);
        } else if (numero<0) {
            System.out.printf("Es negativo: %f" + numero);
        } else{
            System.out.printf("Es cero: %f" + numero);
        }
    }
}
