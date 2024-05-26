/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

/**
 *
 * @author ACER NITRO5
 */
import model.CalculatorModel;
import view.CalculatorView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController {
    private CalculatorModel model;
    private CalculatorView view;

    public CalculatorController(CalculatorModel model, CalculatorView view) {
        this.model = model;
        this.view = view;

        this.view.addAdditionListener(new AdditionListener());
        this.view.addSubtractionListener(new SubtractionListener());
        this.view.addMultiplicationListener(new MultiplicationListener());
        this.view.addDivisionListener(new DivisionListener());
    }

    class AdditionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            double firstNumber, secondNumber = 0;
            try {
                firstNumber = view.getFirstNumber();
                secondNumber = view.getSecondNumber();
                model.add(firstNumber, secondNumber);
                view.setResult(model.getResult());
            } catch (NumberFormatException ex) {
                view.displayErrorMessage("Please enter valid numbers");
            }
        }
    }

    class SubtractionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            double firstNumber, secondNumber = 0;
            try {
                firstNumber = view.getFirstNumber();
                secondNumber = view.getSecondNumber();
                model.subtract(firstNumber, secondNumber);
                view.setResult(model.getResult());
            } catch (NumberFormatException ex) {
                view.displayErrorMessage("Please enter valid numbers");
            }
        }
    }

    class MultiplicationListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            double firstNumber, secondNumber = 0;
            try {
                firstNumber = view.getFirstNumber();
                secondNumber = view.getSecondNumber();
                model.multiply(firstNumber, secondNumber);
                view.setResult(model.getResult());
            } catch (NumberFormatException ex) {
                view.displayErrorMessage("Please enter valid numbers");
            }
        }
    }

    class DivisionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            double firstNumber, secondNumber = 0;
            try {
                firstNumber = view.getFirstNumber();
                secondNumber = view.getSecondNumber();
                model.divide(firstNumber, secondNumber);
                view.setResult(model.getResult());
            } catch (NumberFormatException ex) {
                view.displayErrorMessage("Please enter valid numbers");
            } catch (IllegalArgumentException ex) {
                view.displayErrorMessage("Cannot divide by zero");
            }
        }
    }
}
