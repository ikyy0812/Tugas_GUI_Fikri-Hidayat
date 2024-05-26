/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

/**
 *
 * @author ACER NITRO5
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class CalculatorView extends JFrame {
    private JTextField firstNumber  = new JTextField(10);
    private JTextField secondNumber = new JTextField(10);
    private JButton addButton = new JButton("Add");
    private JButton subtractButton = new JButton("Subtract");
    private JButton multiplyButton = new JButton("Multiply");
    private JButton divideButton = new JButton("Divide");
    private JTextField result = new JTextField(10);

    public CalculatorView() {
        JPanel calcPanel = new JPanel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 200);

        calcPanel.add(new JLabel("First Number:"));
        calcPanel.add(firstNumber);
        calcPanel.add(new JLabel("Second Number:"));
        calcPanel.add(secondNumber);
        calcPanel.add(addButton);
        calcPanel.add(subtractButton);
        calcPanel.add(multiplyButton);
        calcPanel.add(divideButton);
        calcPanel.add(new JLabel("Result:"));
        calcPanel.add(result);

        this.add(calcPanel);
    }

    public double getFirstNumber() {
        return Double.parseDouble(firstNumber.getText());
    }

    public double getSecondNumber() {
        return Double.parseDouble(secondNumber.getText());
    }

    public void setResult(double result) {
        this.result.setText(Double.toString(result));
    }

    public void addAdditionListener(ActionListener listenForAddButton) {
        addButton.addActionListener(listenForAddButton);
    }

    public void addSubtractionListener(ActionListener listenForSubtractButton) {
        subtractButton.addActionListener(listenForSubtractButton);
    }

    public void addMultiplicationListener(ActionListener listenForMultiplyButton) {
        multiplyButton.addActionListener(listenForMultiplyButton);
    }

    public void addDivisionListener(ActionListener listenForDivideButton) {
        divideButton.addActionListener(listenForDivideButton);
    }

    public void displayErrorMessage(String errorMessage) {
        JOptionPane.showMessageDialog(this, errorMessage);
    }
}
