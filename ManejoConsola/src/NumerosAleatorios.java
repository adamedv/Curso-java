import java.util.Random;

public class NumerosAleatorios {
    public static void main(String[] args) {
        System.out.println("*** Números Aleatorios ***");
        var random = new Random();

        //Generar un numero aleatorio entre cero y nueve
        var numeroAleatorio = random.nextInt(10);
        System.out.println("Numero Aleatorio (0-10) = " + numeroAleatorio);

        //Generar un numero aleatorio entre 1 y 10
        numeroAleatorio = random.nextInt(10) + 1;
        System.out.println("Numero Aleatorio (1-10) = " + numeroAleatorio);

        //Generar un numero flotante en 0.0 y 1.0
        var numeroFlotanteAleatorio = random.nextFloat();
        System.out.println("Numero Aleatorio (0.0 - 1.0) = " + numeroFlotanteAleatorio);

        //Simular el lanzamiento de un dado (1 y 6)
        var dado = random.nextInt(6) + 1;
        System.out.println("Dado = " + dado);

        //Boolean aleatorio
        var booleanAleaotorio = random.nextBoolean();
        System.out.println("Boolean aleaotorio: " + booleanAleaotorio);

    }
}
