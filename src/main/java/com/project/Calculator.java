package com.project;

public abstract class Calculator {
    public static double addition(double number1, double number2) throws InvalidInputException {
        if (Double.isNaN(number1) || Double.isNaN(number2) || Double.isInfinite(number1) || Double.isInfinite(number2)) {
            throw new InvalidInputException("Некоректні вхідні дані для додавання!");
        }

        return number1 + number2;
    }

    public static double subtract(double number1, double number2) throws InvalidInputException {
        if (Double.isNaN(number1) || Double.isNaN(number2) || Double.isInfinite(number1) || Double.isInfinite(number2)) {
            throw new InvalidInputException("Некоректні вхідні дані для віднімання!");
        }

        return number1 - number2;
    }

    public static double multiply(double number1, double number2) throws InvalidInputException {
        if (Double.isNaN(number1) || Double.isNaN(number2) || Double.isInfinite(number1) || Double.isInfinite(number2)) {
            throw new InvalidInputException("Некоректні вхідні дані для множення!");
        }

        return number1 * number2;
    }

    public static double divide(double number1, double number2) throws InvalidInputException {
        if (Double.isNaN(number1) || Double.isNaN(number2) || Double.isInfinite(number1) || Double.isInfinite(number2)) {
            throw new InvalidInputException("Некоректні вхідні дані для ділення!");
        }

        if (number2 == 0) {
            throw new ArithmeticException("На нуль ділити не можна!");
        }

        return number1 / number2;
    }
}