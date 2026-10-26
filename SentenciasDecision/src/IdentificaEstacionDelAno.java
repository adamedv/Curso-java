import java.util.Scanner;

public class IdentificaEstacionDelAno {
    public static void main(String[] args) {
        System.out.println("*** Identificac la Estación del Año ***");
        var consola = new Scanner(System.in);

        System.out.print("Ingresa el valor de un mes (valor numérico entero) :");
        var numeroMes = Integer.parseInt(consola.nextLine());

        if (numeroMes>12 || numeroMes<0){
            System.out.println("Estación desconocida");
        } else if (numeroMes<=5 && numeroMes>=3) {
            System.out.println("Primavera");
        } else if (numeroMes>=6 && numeroMes<=8) {
            System.out.println("Verano");
        }else if (numeroMes>=9 && numeroMes<=11) {
            System.out.println("Otoño");
        }else{
            System.out.println("Invierno");
        }

        var estacion = "";
        if(numeroMes == 1 || numeroMes == 2 || numeroMes == 12)
            estacion = "Invierno";
        else if (numeroMes == 3 || numeroMes == 4 || numeroMes == 5)
            estacion = "Primavera";
        else if (numeroMes == 6 || numeroMes == 7 || numeroMes == 8)
            estacion = "Verano";
        else if (numeroMes == 9 || numeroMes == 10 || numeroMes == 11)
            estacion ="Otoño";
        else
            estacion = "Estación desconocida: " + numeroMes;

        System.out.printf("""
                La estación para el mes %d es %s
                """,numeroMes,estacion);

        estacion = switch (numeroMes){
            case 1,2,12 -> "Invierno";
            case 3,4,5 -> "Primavera";
            case 6,7,8 -> "Verano";
            case 9,10,11 -> "Otoño";
            default -> "No válido";
        };
        System.out.printf("""
                La estación para el mes %d es %s
                """,numeroMes,estacion);
    }
}
