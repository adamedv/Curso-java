import java.util.Scanner;

public class SumaDiagonalMatriz {
    public static void main(String[] args) {
        System.out.println("*** Suma de Diagonal de una Matriz ***");
        var consola = new Scanner(System.in);
        int filas, columnas;
        double sumaDiagonalPrincipal = 0, sumaDiagonalSecundaria = 0;

        System.out.print("Ingresa el numero de filas de la matriz: ");
        filas = consola.nextInt();
        System.out.print("Ingresa el numero de columnas de la matriz: ");
        columnas = consola.nextInt();

        var matriz = new double [filas][columnas];

        for (int i = 0; i < filas;i++){
            for (int j = 0; j < columnas;j++){
                System.out.printf("Ingres el valor del elemento[%d][%d]: ",i,j);
                matriz[i][j] = Double.parseDouble(consola.next());

                if (i==j){
                    sumaDiagonalPrincipal+= matriz[i][j];
                }

                if (i+j == columnas-1){
                    sumaDiagonalSecundaria+= matriz[i][j];
                }
            }
        }
        System.out.println("Suma de la diagonal principal: " + sumaDiagonalPrincipal);
        System.out.println("Suma de la diagonal secundaria: " + sumaDiagonalSecundaria);

    }
}
