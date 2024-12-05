package pekan8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TugasKalkulatorPekan8 {
    private static double operand1 = 0;
    private static double operand2 = 0;
    private static String operator = "";
    private static boolean isNewInput = true;
    private static JTextField display;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Kalkulator");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(300, 400);

            JPanel panel = new JPanel();
            panel.setLayout(new BorderLayout());

            display = new JTextField();
            display.setFont(new Font("Arial", Font.BOLD, 32));
            display.setHorizontalAlignment(JTextField.RIGHT);
            display.setEditable(false);
            display.setPreferredSize(new Dimension(300, 60));
            panel.add(display, BorderLayout.NORTH);

            JPanel tombolPanel = new JPanel();
            tombolPanel.setLayout(new GridLayout(5, 4, 5, 5));

            String[] tombol = {
                "←", "c", "∞", "+",
                "7", "8", "9", "-",
                "4", "5", "6", "*",
                "1", "2", "3", "/",
                "0", ".", "=", "%"
            };

            for (String s : tombol) {
                JButton button = new JButton(s);
                button.setFont(new Font("Arial", Font.BOLD, 20));
                tombolPanel.add(button);

                button.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        String command = e.getActionCommand();
                        handleButtonClick(command);
                    }
                });
            }

            panel.add(tombolPanel, BorderLayout.CENTER);
            frame.getContentPane().add(panel);

            frame.setVisible(true);
        });
    }

    private static void handleButtonClick(String command) {
        try {
            if (command.matches("\\d|\\.")) { 
                handleNumberInput(command);
            } else if (command.matches("[+\\-*/]")) { 
                handleOperator(command);
            } else if (command.equals("=")) { 
                calculateResult();
            } else if (command.equals("c")) { 
                clearCalculator();
            } else if (command.equals("←")) { 
                handleBackspace();
            } else if (command.equals("∞")) { 
                display.setText("∞");
            } else if (command.equals("%")) { 
                handlePercentage();
            }
        } catch (Exception ex) {
            display.setText("Error");
        }
    }

    private static void handleNumberInput(String digit) {
        if (isNewInput) {
            display.setText(digit);
            isNewInput = false;
        } else {
            display.setText(display.getText() + digit);
        }
    }

    private static void handleOperator(String op) {
        if (!display.getText().isEmpty()) {
            if (!operator.isEmpty()) {
               
                operand2 = Double.parseDouble(display.getText());
                operand1 = hitung(operand1, operand2, operator);
                display.setText(String.valueOf(operand1));
            } else {
                operand1 = Double.parseDouble(display.getText());
            }
            operator = op;
            isNewInput = true;
        }
    }

    private static void calculateResult() {
        if (!display.getText().isEmpty() && !operator.isEmpty()) {
            operand2 = Double.parseDouble(display.getText());
            double result = hitung(operand1, operand2, operator);
            display.setText(String.valueOf(result));
            operand1 = result;
            operator = "";
            isNewInput = true;
        }
    }

    private static void clearCalculator() {
        display.setText("");
        operand1 = operand2 = 0;
        operator = "";
        isNewInput = true;
    }

    private static void handleBackspace() {
        String text = display.getText();
        if (!text.isEmpty()) {
            display.setText(text.substring(0, text.length() - 1));
        }
    }

    private static void handlePercentage() {
        if (!display.getText().isEmpty()) {
            double value = Double.parseDouble(display.getText());
            display.setText(String.valueOf(value / 100));
        }
    }

    private static double hitung(double a, double b, String op) {
        switch (op) {
            case "+": return a + b;
            case "-": return a - b;
            case "*": return a * b;
            case "/": 
                if (b == 0) throw new ArithmeticException("Pembagian oleh nol");
                return a / b * 1.0;
            default: throw new UnsupportedOperationException("Operator tidak dikenal");
        }
    }
}