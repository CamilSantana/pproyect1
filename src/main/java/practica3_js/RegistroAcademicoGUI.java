/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica3_js;


import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

public class RegistroAcademicoGUI extends JFrame {
    private static final long serialVersionUID = 1L;

    private static final Color COLOR_APROBADO = new Color(0, 128, 0);
    private static final Color COLOR_REPROBADO = new Color(200, 0, 0);

    private final JTextField txtNombre = new JTextField(20);
    private final JTextField txtMatricula = new JTextField(20);
    private final JTextField txtCarrera = new JTextField(20);
    private final JTextField txtPracticas = new JTextField(20);
    private final JTextField txtParciales = new JTextField(20);
    private final JTextField txtAsignaciones = new JTextField(20);
    private final JTextField txtExamenFinal = new JTextField(20);

    private final JLabel lblNotaTotal = new JLabel(" ", SwingConstants.CENTER);
    private final JLabel lblResultado = new JLabel(" ", SwingConstants.CENTER);

    public RegistroAcademicoGUI() {
        super("Registro Académico");
        inicializarComponentes();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setResizable(false);
    }

    private void inicializarComponentes() {
        JPanel panel = new JPanel(new GridBagLayout());
        panel.setBorder(BorderFactory.createEmptyBorder(15, 20, 15, 20));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        int fila = 0;

        JLabel titulo = new JLabel("Registro Académico", SwingConstants.CENTER);
        titulo.setFont(new Font("SansSerif", Font.BOLD, 20));
        agregarFilaCompleta(panel, titulo, gbc, fila++);

        agregarCampo(panel, "Nombre completo:", txtNombre, gbc, fila++);
        agregarCampo(panel, "Matrícula:", txtMatricula, gbc, fila++);
        agregarCampo(panel, "Carrera:", txtCarrera, gbc, fila++);
        agregarCampo(panel, "Prácticas (0-" + (int) Estudiante.MAX_PRACTICAS + "):",
                txtPracticas, gbc, fila++);
        agregarCampo(panel, "Parciales (0-" + (int) Estudiante.MAX_PARCIALES + "):",
                txtParciales, gbc, fila++);
        agregarCampo(panel, "Asignaciones (0-" + (int) Estudiante.MAX_ASIGNACIONES + "):",
                txtAsignaciones, gbc, fila++);
        agregarCampo(panel, "Examen final (0-" + (int) Estudiante.MAX_EXAMEN_FINAL + "):",
                txtExamenFinal, gbc, fila++);

        JButton btnCalcular = new JButton("Calcular Resultado");
        btnCalcular.addActionListener(e -> calcularResultado());
        agregarFilaCompleta(panel, btnCalcular, gbc, fila++);

        JButton btnLimpiar = new JButton("Limpiar");
        btnLimpiar.addActionListener(e -> limpiarCampos());
        agregarFilaCompleta(panel, btnLimpiar, gbc, fila++);

        lblNotaTotal.setFont(new Font("SansSerif", Font.BOLD, 16));
        agregarFilaCompleta(panel, lblNotaTotal, gbc, fila++);

        lblResultado.setFont(new Font("SansSerif", Font.BOLD, 24));
        agregarFilaCompleta(panel, lblResultado, gbc, fila++);

        setContentPane(panel);
    }

    private void agregarCampo(JPanel panel, String texto, JTextField campo,
                              GridBagConstraints gbc, int fila) {
        gbc.gridy = fila;
        gbc.gridx = 0;
        gbc.gridwidth = 1;
        gbc.weightx = 0;
        panel.add(new JLabel(texto), gbc);

        gbc.gridx = 1;
        gbc.weightx = 1;
        panel.add(campo, gbc);
    }

    private void agregarFilaCompleta(JPanel panel, java.awt.Component componente,
                                     GridBagConstraints gbc, int fila) {
        gbc.gridy = fila;
        gbc.gridx = 0;
        gbc.gridwidth = 2;
        gbc.weightx = 1;
        panel.add(componente, gbc);
    }

    private void calcularResultado() {
        try {
            Estudiante estudiante = new Estudiante(
                    txtNombre.getText(),
                    txtMatricula.getText(),
                    txtCarrera.getText(),
                    leerNumero(txtPracticas, "Prácticas"),
                    leerNumero(txtParciales, "Parciales"),
                    leerNumero(txtAsignaciones, "Asignaciones"),
                    leerNumero(txtExamenFinal, "Examen final"));

            mostrarResultado(estudiante);
        } catch (IllegalArgumentException ex) {
            lblNotaTotal.setText(" ");
            lblResultado.setText(" ");
            JOptionPane.showMessageDialog(this, ex.getMessage(),
                    "Error de validación", JOptionPane.ERROR_MESSAGE);
        }
    }

    private double leerNumero(JTextField campo, String nombre) {
        String texto = campo.getText().trim().replace(',', '.');
        if (texto.isEmpty()) {
            throw new IllegalArgumentException(nombre + " no puede estar vacío.");
        }
        try {
            double valor = Double.parseDouble(texto);
            if (Double.isNaN(valor) || Double.isInfinite(valor)) {
                throw new NumberFormatException();
            }
            return valor;
        } catch (NumberFormatException ex) {
            throw new IllegalArgumentException(nombre + " debe ser un número válido.");
        }
    }

    private void mostrarResultado(Estudiante estudiante) {
        lblNotaTotal.setText(String.format("Nota total: %.2f puntos",
                estudiante.calcularNotaTotal()));
        lblResultado.setText(estudiante.getResultado());
        lblResultado.setForeground(
                estudiante.estaAprobado() ? COLOR_APROBADO : COLOR_REPROBADO);
    }

    private void limpiarCampos() {
        JTextField[] campos = {txtNombre, txtMatricula, txtCarrera,
                txtPracticas, txtParciales, txtAsignaciones, txtExamenFinal};
        for (JTextField campo : campos) {
            campo.setText("");
        }
        lblNotaTotal.setText(" ");
        lblResultado.setText(" ");
    }
}