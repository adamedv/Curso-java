import java.util.concurrent.Delayed;

public class CicloWhile {
    public static void main(String[] args) {
        int numero = 1;

        while (numero<=5){
            System.out.println(numero++);
            //numero ++;
            try {
                Thread.sleep(500); // Espera 1.5 segundos
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
