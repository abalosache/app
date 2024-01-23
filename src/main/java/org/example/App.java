package org.example;

import java.util.Scanner;
import java.util.Stack;


public class App {
    private final Stack<Double> queue = new Stack<>();
    private final String NUMBER_PATTERN = "-?\\d+(\\.\\d+)?";
    private final String OPERATOR_PATTERN = "[+\\-*/]";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //can be use o file or something else
        App app = new App();

        System.out.println("By entering 'q' or press 'CTRL + D' you can close this program");

        while (true) {
            System.out.print("> ");
            if (scanner.hasNextLine()) {
                var input = scanner.nextLine();

                if (input.equals("q")) {
                    break;
                }

                var result = app.rpn(input);
                if (!Double.isNaN(result)) {
                    System.out.println(result);
                }
            }
        }
        scanner.close();
    }


    private double rpn(String input) {
        String[] elements = input.split(" ");

        for (var element : elements) {
            if (element.matches(NUMBER_PATTERN)) {
                queue.push(Double.valueOf(element));
            } else if (element.matches(OPERATOR_PATTERN)) {
                if (queue.size() < 2) {
                    System.out.println("Error - Number of parameters!");
                    return Double.NaN;
                }
                return computeOperation(element);
            } else {
                System.out.println("Error - element is not valid!");
                return Double.NaN;
            }
        }

        if (queue.size() == 1 || queue.size() == 2) {
            return queue.peek();
        } else {
            System.out.println("Error - invalid expression!");
            queue.clear();
            return Double.NaN;
        }

    }

    private double computeOperation(String element) {
        var firstNumber = queue.pop();
        var secondNumber = queue.pop();
        return calculate(firstNumber, secondNumber, element);
    }

    private double calculate(double firstNumber, double secondNumber, String operation) {
        switch (operation) {
            case "+":
                return firstNumber + secondNumber;
            case "-":
                return firstNumber - secondNumber;
            case "*":
                return firstNumber * secondNumber;
            case "/":
                if (secondNumber == 0) {
                    System.out.println("Error: Division by zero");
                    return Double.NaN;
                }
                return firstNumber / secondNumber;
            default:
                return Double.NaN;
        }
    }
}
