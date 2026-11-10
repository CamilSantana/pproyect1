/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica3_js;

public class Estudiante {
    public static final double MAX_PRACTICAS = 40;

    public static final double MAX_PARCIALES = 20;

    public static final double MAX_ASIGNACIONES = 20;

    public static final double MAX_EXAMEN_FINAL = 20;

    public static final double NOTA_APROBACION = 60;

    private String nombreCompleto;
    private String matricula;
    private String carrera;
    private double practicas;
    private double parciales;
    private double asignaciones;
    private double examenFinal;

    public Estudiante(String nombreCompleto, String matricula, String carrera,
                      double practicas, double parciales,
                      double asignaciones, double examenFinal) {
        setNombreCompleto(nombreCompleto);
        setMatricula(matricula);
        setCarrera(carrera);
        setPracticas(practicas);
        setParciales(parciales);
        setAsignaciones(asignaciones);
        setExamenFinal(examenFinal);
    }

    public double calcularNotaTotal() {
        return practicas + parciales + asignaciones + examenFinal;
    }

    public boolean estaAprobado() {
        return calcularNotaTotal() >= NOTA_APROBACION;
    }

    public String getResultado() {
        return estaAprobado() ? "APROBADO" : "REPROBADO";
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = validarTexto(nombreCompleto, "El nombre completo");
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = validarTexto(matricula, "La matrícula");
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = validarTexto(carrera, "La carrera");
    }

    public double getPracticas() {
        return practicas;
    }

    public void setPracticas(double practicas) {
        this.practicas = validarRango(practicas, MAX_PRACTICAS, "Prácticas");
    }

    public double getParciales() {
        return parciales;
    }

    public void setParciales(double parciales) {
        this.parciales = validarRango(parciales, MAX_PARCIALES, "Parciales");
    }

    public double getAsignaciones() {
        return asignaciones;
    }

    public void setAsignaciones(double asignaciones) {
        this.asignaciones = validarRango(asignaciones, MAX_ASIGNACIONES, "Asignaciones");
    }

    public double getExamenFinal() {
        return examenFinal;
    }

    public void setExamenFinal(double examenFinal) {
        this.examenFinal = validarRango(examenFinal, MAX_EXAMEN_FINAL, "Examen final");
    }

    private static String validarTexto(String valor, String campo) {
        if (valor == null || valor.trim().isEmpty()) {
            throw new IllegalArgumentException(campo + " no puede estar vacío.");
        }
        return valor.trim();
    }

    private static double validarRango(double valor, double maximo, String campo) {
        if (valor < 0 || valor > maximo) {
            throw new IllegalArgumentException(
                    campo + " debe estar entre 0 y " + (int) maximo + ".");
        }
        return valor;
    }
}