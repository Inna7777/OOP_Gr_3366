package CalculatorServise;

import Controller.iComplexNumber;
import Controller.iOperation;

public class Calculator {
    public iComplexNumber calculate(iComplexNumber num1, iComplexNumber num2, iOperation operation) {
            return operation.action(num1, num2);
        }
    }

