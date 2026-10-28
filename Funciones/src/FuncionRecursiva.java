public class FuncionRecursiva {

    static void funcionRecursiva(int numero){
        if (numero == 1) {
            System.out.print(numero + " ");
        }else {
            System.out.print(numero + " ");
            funcionRecursiva(numero-1);
            System.out.print(numero + " ");
        }
    }
    public static void main(String[] args) {
        var numero = 10;
        funcionRecursiva(numero);
    }
}
