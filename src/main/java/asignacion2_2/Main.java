package asignacion2_2;

public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        // Sumar: 2, 3 y 4 parámetros
        System.out.println("Sumar (2): " + calc.Sumar(10, 5));            // 15
        System.out.println("Sumar (3): " + calc.Sumar(10, 5, 2));         // 17
        System.out.println("Sumar (4): " + calc.Sumar(10, 5, 2, 1));      // 18

        // Restar: 2, 3 y 4 parámetros
        System.out.println("Restar (2): " + calc.Restar(10, 5));          // 5
        System.out.println("Restar (3): " + calc.Restar(10, 5, 2));       // 3
        System.out.println("Restar (4): " + calc.Restar(10, 5, 2, 1));    // 2

        // Multiplicar: 2, 3 y 4 parámetros
        System.out.println("Multiplicar (2): " + calc.Multiplicar(10, 5));          // 50
        System.out.println("Multiplicar (3): " + calc.Multiplicar(10, 5, 2));       // 100
        System.out.println("Multiplicar (4): " + calc.Multiplicar(10, 5, 2, 1));    // 100

        // Dividir: solo 2 parámetros
        System.out.println("Dividir: " + calc.Dividir(10, 5));            // 2
    }
}