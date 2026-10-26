import java.util.Scanner;

public class CasaDeLosEspejos {
    public static void main(String[] args) {
        System.out.println("*** Casa de los espejos ***");
        var consola = new Scanner(System.in);
        final var edadMinima = 10;

        System.out.println("Ingresa tu edad: ");
        var edad = Integer.parseInt(consola.nextLine());

        System.out.println("¿Te da miedo la oscuridad?: ");
        var hasMiedoOscuridad = Boolean.parseBoolean(consola.nextLine());

        if(edad>=edadMinima && !hasMiedoOscuridad){
            System.out.println("Puedes entrar a la casa de los espejos");
        }else{
            System.out.println("No puedes entrar a la casa de los espejos");
        }
    }
}
