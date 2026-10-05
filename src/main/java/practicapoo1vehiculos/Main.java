package practicapoo1vehiculos;

public class Main {
    public static void main(String[] args) {

        Vehiculo v1 = new Vehiculo();                                  
        Vehiculo v2 = new Vehiculo("A123456");                         
        Vehiculo v3 = new Vehiculo("B654321", "Toyota", "Corolla");    

        System.out.println("Vehiculo 1: " + v1.getPlaca() + " | " + v1.getMarca() + " " + v1.getModelo());
        System.out.println("Vehiculo 2: " + v2.getPlaca() + " | " + v2.getMarca() + " " + v2.getModelo());
        System.out.println("Vehiculo 3: " + v3.getPlaca() + " | " + v3.getMarca() + " " + v3.getModelo());

        System.out.println();
        System.out.println("Solo km (10000): " + v3.calcularMantenimiento(10000));
        System.out.println("Km + servicio completo: " + v3.calcularMantenimiento(10000, "completo"));
        System.out.println("Km + premium + 5 anos: " + v3.calcularMantenimiento(10000, "premium", 5));
    }
}