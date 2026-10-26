public class NumerosImpares {
    public static void main(String[] args) {
        System.out.println("*** Numeros Impares ***");
        var contador = 1;
        while (contador < 20) {
            if (contador % 2 == 1) {
                System.out.println(contador);
            }
            contador++;
        }
    }
}
