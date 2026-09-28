
package temafundamentos1java;


public class NominaMensual {
    public static void main(String[] args) {
        double salarioPorHora = 15.50;
        int[] horasTrabajadas = {8, 8, 7, 9, 8, 6, 0}; // Lun-Dom
        String[] dias = {"Lun", "Mar", "Mié", "Jue", "Vie", "Sáb", "Dom"};

        double totalSemanal = 0;

        System.out.println("=== REPORTE SEMANAL ===");
        System.out.println("Salario por hora: $" + salarioPorHora);
        System.out.println("\nDetalle diario:");

        for (int i = 0; i < horasTrabajadas.length; i++) {
            double pagoDiario = horasTrabajadas[i] * salarioPorHora;
            totalSemanal += pagoDiario;

            System.out.println(dias[i] + ": " + horasTrabajadas[i] +
                    " horas = $" + pagoDiario);
        }

        System.out.println("\nTOTAL SEMANAL: $" + totalSemanal);
        System.out.println("TOTAL MENSUAL (aprox): $" + (totalSemanal * 4));
    }
}