package practicapoo1telefonia;

public class Factura {
    private static final double COSTO_MINUTO_EXTRA = 2.50;
    private static final double COSTO_GB_EXTRA = 100.0;

    private Cliente cliente;           // la Factura USA al Cliente (y, por él, a su Plan)
    private int minutosUsados;
    private double datosUsadosGB;
    private double cargosExtras;

    public Factura(Cliente cliente, int minutosUsados, double datosUsadosGB) {
        this.cliente = cliente;
        this.minutosUsados = minutosUsados;
        this.datosUsadosGB = datosUsadosGB;
        this.cargosExtras = calcularCargosExtras();
    }

    public double calcularCargosExtras() {
        Plan plan = cliente.getPlan();
        double extra = 0;

        if (minutosUsados > plan.getMinutosIncluidos()) {
            int minutosExceso = minutosUsados - plan.getMinutosIncluidos();
            extra += minutosExceso * COSTO_MINUTO_EXTRA;
        }

        if (datosUsadosGB > plan.getDatosGB()) {
            double datosExceso = datosUsadosGB - plan.getDatosGB();
            extra += datosExceso * COSTO_GB_EXTRA;
        }

        return extra;
    }

    public double calcularTotal() {
        return cliente.getPlan().getPrecioMensual() + cargosExtras;
    }

    public void generarFactura() {
        Plan plan = cliente.getPlan();

        System.out.println("========== FACTURA ==========");
        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println("Telefono: " + cliente.getNumeroTelefonico());
        System.out.println("-----------------------------");
        System.out.println("Minutos: " + minutosUsados + " usados de " + plan.getMinutosIncluidos());
        System.out.println("Datos: " + datosUsadosGB + " GB usados de " + plan.getDatosGB() + " GB");
        System.out.println("-----------------------------");
        System.out.printf("Precio del plan: %.2f%n", plan.getPrecioMensual());
        System.out.printf("Cargos por exceso: %.2f%n", cargosExtras);
        System.out.printf("TOTAL A PAGAR: %.2f%n", calcularTotal());
        System.out.println("=============================");
    }
}
