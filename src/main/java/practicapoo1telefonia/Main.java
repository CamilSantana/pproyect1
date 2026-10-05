
package practicapoo1telefonia;

public class Main {
    public static void main(String[] args) {
        Plan plan = new Plan(300, 5, 1500);
        Cliente cliente = new Cliente("Frost", "809-555-1234", plan);

        Factura factura = new Factura(cliente, 350, 6.5);
        factura.generarFactura();
    }
}