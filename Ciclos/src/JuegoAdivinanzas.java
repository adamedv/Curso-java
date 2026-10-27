/* Jugador debe adivinar un numero secreto
        ciclo while hasta que el jugador lo adivine
        numerosecreto random 1-50
        se deben contar los intentos fallidos
        orientar al jugador si el numero fue mayor o menor
        al atinarlo felicitar al usuario y mencionar el numero de intentos
        Opcional: limitar el juego a 10 opciones
         */

import java.util.Random;
import java.util.Scanner;

public class JuegoAdivinanzas {
    public static void main(String[] args) {
        System.out.println("*** Juego Adivinanzas ***");
        var consola = new Scanner(System.in);
        Random random = new Random();
        var numero = random.nextInt(50)+1;
        final var LIMITE_INTENTOS = 10;
        var intento = 1;

        System.out.print("Adivina el número: ");
        var numeroIngresado = Integer.parseInt(consola.nextLine());
        System.out.println("Intento: " + intento);
        intento++;

        while(numero!=numeroIngresado && intento<=LIMITE_INTENTOS){
            if (numeroIngresado>numero){
                System.out.printf("""
            El número ingresado %d es mayor al número por adivinar
            """,numeroIngresado);
            }else {
                System.out.printf("""
            El número ingresado %d es menor al número por adivinar
            """,numeroIngresado);
            }
            System.out.print("Inténtelo de nuevo: ");
            numeroIngresado = Integer.parseInt(consola.next());
            System.out.println("Intento: " + intento);
            intento++;

        }
        if(numeroIngresado==numero){
            System.out.println("Felicidades lo has logrado");
            System.out.print("Resultado: " + numero + "\n");
            System.out.printf("En %d intentos",intento);
        }else {
            System.out.printf("\nLímite de intentos alcanzado: %d intentos",LIMITE_INTENTOS);
            System.out.printf("\nNumero no encontrado: %d",numero);
        }

    }

}

