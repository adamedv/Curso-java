public class Matrices {
    public static void main(String[] args) {
        //Definir matriz
//        var matriz = new int [2][3];
        var contador = 0;

//        Modificar los valores de la matriz
//        matriz[0][0] = 100;
//        matriz[0][1] = 200;
//        matriz[0][2] = 300;
//        matriz[1][0] = 400;
//        matriz[1][1] = 500;
//        matriz[1][2] = 600;
        var matriz = new int[][]{
                {100,200,300},
                {400,500,600}
        };


        //Acedemos a los valores
        System.out.println("Valor 1 [0][0]: " +  matriz[0][0]);
        System.out.println("Valor 2 [0][1]: " +  matriz[0][1]);
        System.out.println("Valor 3 [0][2]: " +  matriz[0][2]);
        System.out.println("Valor 4 [1][0]: " +  matriz[1][0]);
        System.out.println("Valor 5 [1][1]: " +  matriz[1][1]);
        System.out.println("Valor 6 [1][2]: " +  matriz[1][2]);

        // Recorrer una matriz
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                contador++;
                System.out.printf("Valor %d [%d][%d]: %d \n",contador,i,j,matriz[i][j]);
            }
        }

    }
}
