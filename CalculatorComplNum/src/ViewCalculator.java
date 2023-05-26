import java.util.Scanner;

import CalculatorServise.Addition;
import CalculatorServise.Division;
import CalculatorServise.Multiplication;
import Controller.iComplexNumber;
import Controller.iOperation;
import Numbers.RealNumber;

public class ViewCalculator {

public void displayResult(iComplexNumber result) {
    System.out.println("Result: " + result.toString());
}

public iComplexNumber readNumber() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Введите действительную часть: ");
    double realPart = scanner.nextDouble();
    System.out.print("Imaginary part: ");
    double imaginaryPart = scanner.nextDouble();
    return new RealNumber(realPart, imaginaryPart);
}

public iOperation run() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Choose operation (+, *, /): ");
    String input = scanner.nextLine();
    switch (input) {
        case "+":
            return new Addition();
        case "*":
            return new Multiplication();
        case "/":
            return new Division();
        default:
            System.out.println("Invalid operation.");
            return null;
    }
}
}