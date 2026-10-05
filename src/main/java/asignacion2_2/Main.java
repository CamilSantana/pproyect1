package asignacion2_2;

public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

   // Sumar 2, 3 y 4 parametros
        System.out.println("Sumar (2): " + calc.Sumar(10, 5));            
        System.out.println("Sumar (3): " + calc.Sumar(10, 5, 2));        
        System.out.println("Sumar (4): " + calc.Sumar(10, 5, 2, 1));      

    // Restar: 2, 3 y 4 parametros
        System.out.println("Restar (2): " + calc.Restar(10, 5));         
        System.out.println("Restar (3): " + calc.Restar(10, 5, 2));       
        System.out.println("Restar (4): " + calc.Restar(10, 5, 2, 1));    

    // Multiplicar: 2, 3 y 4 parametros
        System.out.println("Multiplicar (2): " + calc.Multiplicar(10, 5));          
        System.out.println("Multiplicar (3): " + calc.Multiplicar(10, 5, 2));       
        System.out.println("Multiplicar (4): " + calc.Multiplicar(10, 5, 2, 1));    

     // Dividir: solo 2 parametros
        System.out.println("Dividir: " + calc.Dividir(10, 5));            
    }
}