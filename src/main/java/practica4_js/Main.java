/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica4_js;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    private final Calculadora calculadora = new Calculadora();

    private final ConversorTemperatura conversor = new ConversorTemperatura();

    private final Raizcuadrada_Exponente raizExp = new Raizcuadrada_Exponente();

    public Main() {
        super("Calculadora y Conversor");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JTabbedPane pestanas = new JTabbedPane();
        pestanas.addTab("Modo Calculadora", crearPanelCalculadora());
        pestanas.addTab("Modo Conversor", crearPanelConversor());
        pestanas.addTab("Raíz y Exponente", crearPanelRaizExponente());

        add(pestanas);
        setSize(480, 320);
        setLocationRelativeTo(null);
    }

    private JPanel crearPanelCalculadora() {
        JTextField txtA = new JTextField(10);
        JTextField txtB = new JTextField(10);
        JLabel lblResultado = crearEtiquetaResultado();

        JButton btnSumar = new JButton("+");
        JButton btnRestar = new JButton("−");
        JButton btnMultiplicar = new JButton("×");
        JButton btnDividir = new JButton("÷");

        btnSumar.addActionListener(e -> operar(txtA, txtB, lblResultado, '+'));
        btnRestar.addActionListener(e -> operar(txtA, txtB, lblResultado, '-'));
        btnMultiplicar.addActionListener(e -> operar(txtA, txtB, lblResultado, '*'));
        btnDividir.addActionListener(e -> operar(txtA, txtB, lblResultado, '/'));

        JPanel panel = crearPanelBase();
        agregarFila(panel, 0, "Número 1:", txtA);
        agregarFila(panel, 1, "Número 2:", txtB);

        JPanel botones = new JPanel(new GridLayout(1, 4, 8, 0));
        botones.add(btnSumar);
        botones.add(btnRestar);
        botones.add(btnMultiplicar);
        botones.add(btnDividir);
        agregarComponente(panel, 2, botones);
        agregarComponente(panel, 3, lblResultado);
        return panel;
    }

    private void operar(JTextField txtA, JTextField txtB, JLabel resultado, char operador) {
        try {
            double a = Double.parseDouble(txtA.getText().trim());
            double b = Double.parseDouble(txtB.getText().trim());
            double r;
            switch (operador) {
                case '+': r = calculadora.sumar(a, b); break;
                case '-': r = calculadora.restar(a, b); break;
                case '*': r = calculadora.multiplicar(a, b); break;
                default:  r = calculadora.dividir(a, b); break;
            }
            mostrarResultado(resultado, "Resultado: " + formatear(r));
        } catch (NumberFormatException ex) {
            mostrarError(resultado, "Error: ingrese números válidos.");
        } catch (ArithmeticException ex) {
            mostrarError(resultado, ex.getMessage());
        }
    }

    private JPanel crearPanelConversor() {
        JTextField txtValor = new JTextField(10);
        JLabel lblResultado = crearEtiquetaResultado();
        JButton btnFaC = new JButton("°F → °C");
        JButton btnCaF = new JButton("°C → °F");

        btnFaC.addActionListener(e -> convertir(txtValor, lblResultado, true));
        btnCaF.addActionListener(e -> convertir(txtValor, lblResultado, false));

        JPanel panel = crearPanelBase();
        agregarFila(panel, 0, "Temperatura:", txtValor);

        JPanel botones = new JPanel(new GridLayout(1, 2, 8, 0));
        botones.add(btnFaC);
        botones.add(btnCaF);
        agregarComponente(panel, 1, botones);
        agregarComponente(panel, 2, lblResultado);
        return panel;
    }

    private void convertir(JTextField txtValor, JLabel resultado, boolean fahrenheitACelsius) {
        try {
            double valor = Double.parseDouble(txtValor.getText().trim());
            if (fahrenheitACelsius) {
                mostrarResultado(resultado, formatear(valor) + " °F = "
                        + formatear(conversor.fahrenheitACelsius(valor)) + " °C");
            } else {
                mostrarResultado(resultado, formatear(valor) + " °C = "
                        + formatear(conversor.celsiusAFahrenheit(valor)) + " °F");
            }
        } catch (NumberFormatException ex) {
            mostrarError(resultado, "Error: ingrese un número válido.");
        }
    }

    private JPanel crearPanelRaizExponente() {
        JTextField txtNumero = new JTextField(10);
        JTextField txtExponente = new JTextField(10);
        JLabel lblResultado = crearEtiquetaResultado();
        JButton btnRaiz = new JButton("√ Raíz cuadrada");
        JButton btnPotencia = new JButton("Exponente (x^n)");

        btnRaiz.addActionListener(e -> {
            try {
                double n = Double.parseDouble(txtNumero.getText().trim());
                mostrarResultado(lblResultado, "√" + formatear(n) + " = " + formatear(raizExp.raizCuadrada(n)));
            } catch (NumberFormatException ex) {
                mostrarError(lblResultado, "Error: ingrese un número válido.");
            } catch (ArithmeticException ex) {
                mostrarError(lblResultado, ex.getMessage());
            }
        });

        btnPotencia.addActionListener(e -> {
            try {
                double base = Double.parseDouble(txtNumero.getText().trim());
                double exp = Double.parseDouble(txtExponente.getText().trim());
                mostrarResultado(lblResultado, formatear(base) + " ^ " + formatear(exp)
                        + " = " + formatear(raizExp.exponente(base, exp)));
            } catch (NumberFormatException ex) {
                mostrarError(lblResultado, "Error: ingrese números válidos (base y exponente).");
            }
        });

        JPanel panel = crearPanelBase();
        agregarFila(panel, 0, "Número / Base:", txtNumero);
        agregarFila(panel, 1, "Exponente:", txtExponente);

        JPanel botones = new JPanel(new GridLayout(1, 2, 8, 0));
        botones.add(btnRaiz);
        botones.add(btnPotencia);
        agregarComponente(panel, 2, botones);
        agregarComponente(panel, 3, lblResultado);
        return panel;
    }

    private JPanel crearPanelBase() {
        JPanel panel = new JPanel(new GridBagLayout());
        panel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        return panel;
    }

    private JLabel crearEtiquetaResultado() {
        JLabel etiqueta = new JLabel(" ", SwingConstants.CENTER);
        etiqueta.setFont(new Font("SansSerif", Font.BOLD, 15));
        return etiqueta;
    }

    private void agregarFila(JPanel panel, int fila, String texto, JTextField campo) {
        GridBagConstraints c = new GridBagConstraints();
        c.gridy = fila;
        c.insets = new Insets(6, 6, 6, 6);
        c.gridx = 0;
        c.anchor = GridBagConstraints.EAST;
        panel.add(new JLabel(texto), c);
        c.gridx = 1;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 1;
        panel.add(campo, c);
    }

    private void agregarComponente(JPanel panel, int fila, JComponent componente) {
        GridBagConstraints c = new GridBagConstraints();
        c.gridy = fila;
        c.gridx = 0;
        c.gridwidth = 2;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(10, 6, 6, 6);
        panel.add(componente, c);
    }

    private void mostrarResultado(JLabel etiqueta, String texto) {
        etiqueta.setForeground(new Color(20, 90, 40));
        etiqueta.setText(texto);
    }

    private void mostrarError(JLabel etiqueta, String texto) {
        etiqueta.setForeground(Color.RED);
        etiqueta.setText(texto);
    }

    private String formatear(double valor) {
        if (valor == Math.rint(valor) && Math.abs(valor) < 1e15) {
            return String.valueOf((long) valor);
        }
        return String.format("%.4f", valor);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Main().setVisible(true));
    }
}