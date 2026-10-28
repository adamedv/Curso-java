import java.util.Scanner;

public class introducirValoresMatriz {
    public static void main(String[] args) {
        System.out.println("*** Introducir valores en una matriz ***");
        int filas, columnas;
        var consola = new Scanner(System.in);

        System.out.print("Ingresa el numero de filas de la matriz: ");
        filas = consola.nextInt();
        System.out.print("Ingresa el numero de columnas de la matriz: ");
        columnas = consola.nextInt();

        var matriz = new double [filas][columnas];

        for(int i = 0; i < filas; i++){
            for(int j = 0; j < columnas; j++){
                System.out.printf("Ingres el valor del elemento[%d][%d]: ",i,j);
                matriz[i][j] = Double.parseDouble(consola.next());
            }
        }

        for(int i = 0; i < filas; i++){
            for(int j = 0; j < columnas; j++){
                System.out.printf("\nElemento[%d][%d]: %.2f",i,j,matriz[i][j]);
            }
        }
    }
}
