import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.event.*;

public class MainWindow extends JFrame implements ActionListener {
    private JTextField display;
    private JButton[] botoes;
    private String[] labels = {
            "7", "8", "9", "+",
            "4", "5", "6", "-",
            "1", "2", "3", "*",
            "p", "0", ",", "/",
            "<=", "C", "%", "=",
    };

    private double resultado = 0;
    private String operacao = "=";
    private boolean inicio = true;

    public MainWindow() {
        setTitle("Calculadora");
        setSize(350, 500); // Aumentando a altura da janela
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false); // Bloqueando o redimensionamento da janela

        display = new JTextField("0");
        display.setEditable(false);
        display.setPreferredSize(new Dimension(300, 100)); // Ajustando o tamanho do JTextField
        add(display, BorderLayout.NORTH);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 4)); // Aumentando o número de linhas
        botoes = new JButton[labels.length];

        for (int i = 0; i < labels.length; i++) {
            botoes[i] = new JButton(labels[i]);
            panel.add(botoes[i]);
            botoes[i].addActionListener(this);
        }

        add(panel, BorderLayout.CENTER);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent event) {
        String comando = event.getActionCommand();
        if (comando.charAt(0) >= '0' && comando.charAt(0) <= '9' || comando.equals(".")) {
            if (inicio) {
                display.setText(comando);
                inicio = false;
            } else {
                display.setText(display.getText() + comando);
            }
        } else if (comando.equals("C")) { // Limpar a calculadora
            display.setText("0");
            resultado = 0;
            operacao = "=";
            inicio = true;
        } else if (comando.equals("<=")) { // Apagar um dígito
            String texto = display.getText();
            if (texto.length() > 0) {
                texto = texto.substring(0, texto.length() - 1);
                if (texto.length() == 0 || texto.equals("-")) {
                    texto = "0";
                    inicio = true;
                }
                display.setText(texto);
            }
        } else if (comando.equals("%")) { // Calcular a porcentagem
            double valor = Double.parseDouble(display.getText());
            valor /= 100;
            display.setText("" + valor);
            inicio = true;
        } else if (comando.equals("p")) { // Calcular a potência de 2
            double valor = Double.parseDouble(display.getText());
            double resultadoPotencia = Math.pow(valor, 2);
            display.setText("" + resultadoPotencia);
            inicio = true;
        } else {
            if (inicio) {
                if (comando.equals("-")) {
                    display.setText(comando);
                    inicio = false;
                } else {
                    operacao = comando;
                }
            } else {
                double valor = Double.parseDouble(display.getText());
                calcular(valor);
                operacao = comando;
                inicio = true;
            }
        }
    }

    private void calcular(double valor) {
        switch (operacao) {
            case "+":
                resultado += valor;
                break;
            case "-":
                resultado -= valor;
                break;
            case "*":
                resultado *= valor;
                break;
            case "/":
                if (valor != 0) { // Verificar divisão por zero
                    resultado /= valor;
                } else {
                    JOptionPane.showMessageDialog(this, "Erro: Divisão por zero", "Erro", JOptionPane.ERROR_MESSAGE);
                }
                break;
            case "=":
                resultado = valor;
                break;
        }
        display.setText("" + resultado);
    }

    public static void main(String[] args) {
        new MainWindow();
    }
}