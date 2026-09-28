
package temafundamentos1java;


public class SwitchModerno {
    public static void main(String[] args) {
        String mes = "Enero";

        // Switch expression (más conciso)
        int diasDelMes = switch (mes) {
            case "Enero", "Marzo", "Mayo", "Julio",
                 "Agosto", "Octubre", "Diciembre" -> 31;
            case "Abril", "Junio", "Septiembre", "Noviembre" -> 30;
            case "Febrero" -> 28;
            default -> 0;
        };

        System.out.println(mes + " tiene " + diasDelMes + " días");

        // Con bloques de código
        String trimestre = switch (mes) {
            case "Enero", "Febrero", "Marzo" -> {
                System.out.println("Primer trimestre del año");
                yield "Q1";
            }
            case "Abril", "Mayo", "Junio" -> {
                System.out.println("Segundo trimestre del año");
                yield "Q2";
            }
            case "Julio", "Agosto", "Septiembre" -> "Q3";
            case "Octubre", "Noviembre", "Diciembre" -> "Q4";
            default -> "Mes inválido";
        };

        System.out.println("Trimestre: " + trimestre);
    }
}