/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculator1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator1 extends JFrame implements ActionListener {
    private JTextField displayField;
    private JButton[] buttons;
    private String[] buttonLabels = {
        "7", "8", "9", "/",
        "4", "5", "6", "*",
        "1", "2", "3", "-",
        "0", ".", "=", "+"
    };
    private Font font = new Font("Arial", Font.PLAIN, 20);
    private double num1, num2;
    private String operator;
    private boolean startNewInput = true;

    public Calculator1() {
        setTitle("Calculator");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4));

        displayField = new JTextField();
        displayField.setFont(font);
        displayField.setEditable(false);

        buttons = new JButton[buttonLabels.length];

        for (int i = 0; i < buttonLabels.length; i++) {
            buttons[i] = new JButton(buttonLabels[i]);
            buttons[i].setFont(font);
            buttons[i].addActionListener(this);
            panel.add(buttons[i]);
        }

        getContentPane().add(displayField, BorderLayout.NORTH);
        getContentPane().add(panel, BorderLayout.CENTER);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        
        if (startNewInput) {
            displayField.setText("");
            startNewInput = false;
        }
        
        if (command.equals("=")) {
            num2 = Double.parseDouble(displayField.getText());
            calculate();
            startNewInput = true;
        } else if (command.equals("C")) {
            displayField.setText("");
            num1 = num2 = 0;
            operator = "";
            startNewInput = true;
        } else {
            displayField.setText(displayField.getText() + command);
        }
    }

    private void calculate() {
        double result = 0;
        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    JOptionPane.showMessageDialog(this, "Error: Division by zero", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                break;
        }
        displayField.setText(String.valueOf(result));
        num1 = result;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Calculator1();
            }
        });
    }
}
