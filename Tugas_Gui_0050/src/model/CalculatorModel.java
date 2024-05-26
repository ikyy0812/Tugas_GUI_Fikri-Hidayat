/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ACER NITRO5
 */


public class CalculatorModel {
    private double result;

    public void add(double a, double b) {
        result = a + b;
    }

    public void subtract(double a, double b) {
        result = a - b;
    }

    public void multiply(double a, double b) {
        result = a * b;
    }

    public void divide(double a, double b) {
        if (b != 0) {
            result = a / b;
        } else {
            throw new IllegalArgumentException("Division by zero");
        }
    }

    public double getResult() {
        return result;
    }
}
