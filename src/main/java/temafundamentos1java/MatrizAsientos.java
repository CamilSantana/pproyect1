
package temafundamentos1java;


public class MatrizAsientos {
    public static void main(String[] args) {
        int filas = 5;
        int columnas = 8;

        System.out.println("=== MAPA DE ASIENTOS DEL TEATRO ===");
        System.out.println("   A B C D E F G H");
        System.out.println("   ====================");

        for (int i = 1; i <= filas; i++) {
            System.out.print(i + " | ");
            for (int j = 1; j <= columnas; j++) {
                System.out.print("[ ]");
            }
            System.out.println();
        }

        int totalAsientos = filas * columnas;
        System.out.println("\nTotal de asientos: " + totalAsientos);
    }
}