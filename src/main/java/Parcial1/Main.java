
package Parcial1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CalculadoraMatematica calculadora = new CalculadoraMatematica();
        int opcionMenu;

        do {
            System.out.println("===== CALCULADORA MATEMATICA =====");
            System.out.println("1. Ingresar numeros");
            System.out.println("2. Sumar");
            System.out.println("3. Restar");
            System.out.println("4. Multiplicar");
            System.out.println("5. Dividir");
            System.out.println("0. Salir");
            System.out.println("==================================");
            System.out.print("Seleccione una opcion: ");
            opcionMenu = sc.nextInt();

            switch (opcionMenu) {
                case 1:
                    System.out.print("Ingrese el primer numero: ");
                    double numero1 = sc.nextDouble();
                    System.out.print("Ingrese el segundo numero: ");
                    double numero2 = sc.nextDouble();
                    calculadora.ingresarNumeros(numero1, numero2);
                    break;
                case 2:
                    System.out.println("Resultado: " + calculadora.calcularSuma());
                    break;
                case 3:
                    System.out.println("Resultado: " + calculadora.calcularResta());
                    break;
                case 4:
                    System.out.println("Resultado: " + calculadora.calcularMultiplicacion());
                    break;
                case 5:
                    System.out.println("Resultado: " + calculadora.calcularDivision());
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }

            System.out.println();
        } while (opcionMenu != 0);
    }
}