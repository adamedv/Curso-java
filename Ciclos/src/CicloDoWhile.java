public class CicloDoWhile {
    public static void main(String[] args) {
        var numero = 1;
        do{
            if(numero%2==0){
                System.out.print(numero + " ");
            }
            numero++;
        }while (numero <= 20);
    }
}
