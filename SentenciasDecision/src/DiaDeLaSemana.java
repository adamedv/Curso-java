import java.util.Scanner;

public class DiaDeLaSemana {
    public static void main(String[] args) {
        var consola =  new Scanner(System.in);

        System.out.print("Ingresa el número de un día de la semana (1-7): ");
        var diaNumero = Integer.parseInt(consola.nextLine());

        switch (diaNumero){
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Día no válido");
        }
        String nombredia;

        nombredia = switch (diaNumero){
            case 1 -> "Lunes";
//            case 2 -> {
//                System.out.println("Martes");
//                System.out.println("Las llaves es para dos o más líneas");
//            }
            case 2 -> "Martes";
            case 3 -> "Miércoles";
            case 4 -> "Jueves";
            case 5 -> "Viernes";
            case 6 -> "Sábado";
            case 7 -> "Domingo";
            default -> "Día no válido";
        };
        System.out.println(nombredia);
    }
}
