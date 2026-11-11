/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica4_js;

public class Raizcuadrada_Exponente {
    public double raizCuadrada(double numero) {
        if (numero < 0) {
            throw new ArithmeticException("Error: no existe raíz cuadrada real de un número negativo.");
        }
        return Math.sqrt(numero);
    }

    public double exponente(double base, double exponente) {
        return Math.pow(base, exponente);
    }
}