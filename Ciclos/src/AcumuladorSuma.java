public class AcumuladorSuma {
    public static void main(String[] args) {
        System.out.println("*** Ejercicio Acumulador Suma ***");
        var contador = 1;
        final var MAXIMO = 15;
        var suma = 0;
        //var suma2 = 0;

        while(contador <= MAXIMO){
            // Imprimir lo que va a sumar
            System.out.printf("(Suma + Numero) -> " + suma + "+" + contador + "\n");
//            System.out.printf(contador + " ");
            suma += contador++;
            System.out.println("Suma Parcial: " + suma);

//            suma2 = suma2 + contador;
//            contador++;
        }
        System.out.println("\nTotal: " + suma);
    }
}
