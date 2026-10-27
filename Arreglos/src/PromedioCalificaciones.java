import java.util.Scanner;

public class PromedioCalificaciones {
    public static void main(String[] args) {
        System.out.println("*** Promedio de calificaciones ***");
        var consola = new Scanner(System.in);

        System.out.print("¿Cuántas calificaciones deseas agregar?: ");
        var largo =  consola.nextInt();
        var calificaciones = new double[largo];
        double suma = 0;

        for(int i = 0; i < largo; i++) {
            System.out.printf("Calificacion [%d]: ",i);
            calificaciones[i] = consola.nextDouble();
            suma += calificaciones[i];
        }
        var promedio = suma/largo;
        System.out.printf("\nPromedio: %.2f\n", promedio);
    }
}
