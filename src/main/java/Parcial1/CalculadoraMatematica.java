
package Parcial1;

public class CalculadoraMatematica {

    // Atributos privados
    private double numero1;
    private double numero2;

    // Constructor por defecto
    public CalculadoraMatematica() {
    }

    // Metodo unico para establecer los numeros
    public void ingresarNumeros(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    // Operaciones
    public double calcularSuma() {
        return numero1 + numero2;
    }

    public double calcularResta() {
        return numero1 - numero2;
    }

    public double calcularMultiplicacion() {
        return numero1 * numero2;
    }

    public double calcularDivision() {
        if (numero2 == 0) {
            System.out.println("Error: no se puede dividir entre cero.");
            return 0;
        } else {
            return numero1 / numero2;
        }
    }
}