import java.util.Scanner;

public class SistemaCalificaciones {
    public static void main(String[] args) {
        System.out.println("*** Sistema de Calificaciones ***");
        var consola = new Scanner(System.in);

        System.out.print("Ingresa la calificación numérica (1-10): ");
        var numeroCalificacion =  Double.parseDouble(consola.nextLine());

//        Switch case no puede utilizarle con condiciones y tampoco float o double
//        letracalificacion = switch (numeroCalificacion){
//            case 10,9 -> "A";
//            case 8 -> "B";
//            case 7 -> "C";
//            case 6 -> "D";
//            case 5,4,3,2,1,0 -> "F";
//            default -> "Valor desconocido";
//        };
//        System.out.printf("Tu calificaciión %d es: %s",numeroCalificacion,letracalificacion);

        String letraCalificacion;
        //Utilizando if else sí puede manejar las condiciones
        if (numeroCalificacion<=10 && numeroCalificacion>=9){
             letraCalificacion = "A";
        } else if (numeroCalificacion>=8 && numeroCalificacion<9) {
             letraCalificacion = "B";
        } else if (numeroCalificacion>=7 && numeroCalificacion<8) {
             letraCalificacion = "C";
        } else if (numeroCalificacion>=6 && numeroCalificacion<7) {
             letraCalificacion = "D";
        } else if (numeroCalificacion>=0 && numeroCalificacion<6) {
             letraCalificacion = "F";
        }else {
            letraCalificacion = "Valor desconocido";
        }
        System.out.printf("Tu calificaciión %.1f es: %s",numeroCalificacion,letraCalificacion);
    }
}
