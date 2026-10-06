
package Asignacion1;


public class Ejercicio5 {
    public static void main(String[] args) {
        int suma = 0;
        int i = 1;
        do {
            suma += i;
            i++;
        } while (i <= 50);

        System.out.println("La sumatoria del 1 al 50 es: " + suma);
    }
}