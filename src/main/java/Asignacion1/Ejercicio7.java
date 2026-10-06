
package Asignacion1;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        int a = sc.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        int b = sc.nextInt();

        if (a > b) {
            System.out.println("El mayor es " + a + " y el menor es " + b);
        } else if (b > a) {
            System.out.println("El mayor es " + b + " y el menor es " + a);
        } else {
            System.out.println("Los dos numeros son iguales");
        }
    }
}