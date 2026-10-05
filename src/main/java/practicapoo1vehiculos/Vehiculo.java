package practicapoo1vehiculos;

public class Vehiculo {
    private String placa;
    private String marca;
    private String modelo;

    public Vehiculo(String placa) {
        this.placa = placa;
        this.marca = "Desconocida";
        this.modelo = "Desconocido";
    }

    public Vehiculo(String placa, String marca, String modelo) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
    }

    public Vehiculo() {
        this.placa = "SIN-PLACA";
        this.marca = "Desconocida";
        this.modelo = "Desconocido";
    }
// sobrecarga de metodos para los planes de los vehiculos
        public double calcularMantenimiento(int km) {
            return 1000 + (km * 0.5);
        }

        public double calcularMantenimiento(int km, String tipoServicio) {
            double base = calcularMantenimiento(km);

            if (tipoServicio.equalsIgnoreCase("completo")) {
                return base * 1.5;
            } else if (tipoServicio.equalsIgnoreCase("premium")) {
                return base * 2;
            } else {
                return base;    
        }
    }

    
            public double calcularMantenimiento(int km, String tipoServicio, int anios) {
                return calcularMantenimiento(km, tipoServicio) + (anios * 200);
            }

            public String getPlaca() {
                return placa;
            }

            public String getMarca() {
                return marca;
            }

            public String getModelo() {
                return modelo;
            }
}