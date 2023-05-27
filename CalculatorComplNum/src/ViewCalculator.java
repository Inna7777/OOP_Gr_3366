import java.util.Scanner;

import CalculatorServise.Addition;
import CalculatorServise.Division;
import CalculatorServise.Multiplication;
import Controller.iComplexNumber;
import Controller.iOperation;
import Numbers.RealNumber;

public class ViewCalculator {

public void displayResult(iComplexNumber result) {
    System.out.println("Результат: " + result.toString());
}

public iComplexNumber readNum1() {
    System.out.println("===== Калькулятор комплексных чисел ====");
    Scanner scanner = new Scanner(System.in);
    System.out.print("Введите действительную часть первого: ");
    double realPart = scanner.nextDouble();
    System.out.print("Введите мнимую  часть первого:: ");
    double imaginaryPart = scanner.nextDouble();
    return new RealNumber(realPart, imaginaryPart);
}
public iComplexNumber readNum2() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Введите действительную часть второго числа: ");
    double realPart = scanner.nextDouble();
    System.out.print("Введите мнимую  часть второго числа:: ");
    double imaginaryPart = scanner.nextDouble();
    return new RealNumber(realPart, imaginaryPart);
}
public iOperation run() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Выберите операцию с числами (+, *, /): ");
    String input = scanner.nextLine();
    switch (input) {
        case "+":
            return new Addition();
        case "*":
            return new Multiplication();
        case "/":
            return new Division();
        default:
            System.out.println("Неправильная операция");
            return null;
    }
}
}