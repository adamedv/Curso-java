/* = Asignación simple
 * += Suma y asignación
 * -= Resta y asignación
 * *= Multiplicación y asignación
 * /= división y asignación
 * %= Modulo y asignación
 */

public class OperadoresAsignacion {
    public static void main(String[] args) {
        int a = 10, b = 3;

        a += b; // a = a + b
        System.out.println("Suma y asignación: " + a);

        a -= b; // a = a - b
        System.out.println("Resta y asignación: " + a);

        a *= b;
        System.out.println("Multiplicación y asignación: " + a);

        a /= b; // a = a / b
        System.out.println("División y asignación: " + a);

        a %= b; // a = a % b
        System.out.println("Modulo y asignación: " + a);

    }
}
