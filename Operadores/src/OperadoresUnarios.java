// Operador unario positivo +
// Operador unario negativo +
// Incremento ++
//Decremento --
//Negacion logica !

public class OperadoresUnarios{
    public static void main(String[] args) {
        int a = 10;

        System.out.println("Operador unario más: " + (+a));
        System.out.println("Operador unario menos: " + (-a));

        a++;
        System.out.println("Incremento: " + a);

        a--;
        System.out.println("Decremento: " + a);

        boolean x = true;
        System.out.println("Negación lógica: " + (!x));

    }
}
