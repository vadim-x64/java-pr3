package com.project;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        boolean continueCalculating = true;

        System.out.println("Калькулятор");

        while (continueCalculating) {
            try {
                System.out.println();
                System.out.println("Виберіть операцію:");
                System.out.println("0. Вихід");
                System.out.println("1. Додавання");
                System.out.println("2. Віднімання");
                System.out.println("3. Множення");
                System.out.println("4. Ділення");
                System.out.println();
                System.out.print("Що обираєте? ");

                int choice = scanner.nextInt();
                double number1 = 0, number2 = 0, result = 0;

                if (choice >= 1 && choice <= 4) {
                    System.out.print("Введіть перше число: ");
                    number1 = scanner.nextDouble();
                    System.out.print("Введіть друге число: ");
                    number2 = scanner.nextDouble();

                    switch (choice) {
                        case 1:
                            result = calculator.addition(number1, number2);
                            System.out.println("Результат додавання - " + result);
                            break;
                        case 2:
                            result = calculator.subtract(number1, number2);
                            System.out.println("Результат віднімання - " + result);
                            break;
                        case 3:
                            result = calculator.multiply(number1, number2);
                            System.out.println("Результат множення - " + result);
                            break;
                        case 4:
                            result = calculator.divide(number1, number2);
                            System.out.println("Результат ділення - " + result);
                            break;
                        default:
                            System.out.println("Введено некоректне значення!");
                            break;
                    }
                } else if (choice == 0) {
                    System.out.println("Виконання програми завершено!");
                    break;
                }
            } catch (ArithmeticException arithmeticException) {
                System.out.println(arithmeticException.getMessage());
            } catch (InvalidInputException invalidInputException) {
                System.out.println(invalidInputException.getMessage());
            } catch (InputMismatchException inputMismatchException) {
                System.out.println("Введено некоректні дані для вибору операції!");
                scanner.nextLine();
            } catch (Exception exception) {
                System.out.println("Сталася помилка: " + exception.getMessage());
            } finally {
                System.out.println("Обробка запиту завершена!");
            }
        }

        scanner.close();
    }
}