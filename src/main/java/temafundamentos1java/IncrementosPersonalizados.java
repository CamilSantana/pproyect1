
package temafundamentos1java;


public class IncrementosPersonalizados {
    public static void main(String[] args) {
        // Contar de 2 en 2
        System.out.println("Números pares del 0 al 20:");
        for (int i = 0; i <= 20; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        // Contar hacia atrás
        System.out.println("Cuenta regresiva:");
        for (int i = 10; i >= 0; i--) {
            System.out.print(i + " ");
            if (i == 0) {
                System.out.println("¡DESPEGUE!");
            }
        }
    }
}