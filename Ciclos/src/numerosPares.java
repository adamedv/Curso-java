public class numerosPares {
    public static void main(String[] args) {
        System.out.println("*** Números Pares ***");

        var numero = 1;

        while (numero <= 20) {
            if (numero%2==0){
//                System.out.println(numero); imprime en vertical
                System.out.print(numero + " "); //imprime en horizontal
            }
            try {
                Thread.sleep(100); // Espera milisegundos
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            numero ++;
        }
    }
}
