import java.util.Scanner;

public class FuncionEsPar {

    static boolean esPar(int numero){
//        if (numero%2==0){
//            return true;
//        }
//        return false;
        return (numero%2==0)? true : false;
    }

    public static void main(String[] args) {
        System.out.println("*** Función es par ***");
        var consola = new Scanner(System.in);

        System.out.print("Ingresa un número: ");
        var numero = Integer.parseInt(consola.nextLine());
        var resutado = esPar(numero);
        if (resutado==true){
            System.out.print("Es par");
        }else{
            System.out.print("No es par");
        }
    }
}
