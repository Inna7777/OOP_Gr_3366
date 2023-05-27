package CalculatorServise;


import Controller.iComplexNumber;
import Controller.iOperation;
import Numbers.RealNumber;

// класс для создания метода деления
public class Division implements iOperation{

    @Override
    public iComplexNumber action(iComplexNumber num1, iComplexNumber num2) {
        double divisor = Math.pow(num2.getRealPart(), 2) + Math.pow(num2.getImaginaryPart(), 2);
        double realPart = ((num1.getRealPart() * num2.getRealPart()) + (num1.getImaginaryPart() * num2.getImaginaryPart())) / divisor;
        double imaginaryPart = ((num1.getImaginaryPart() * num2.getRealPart()) - (num1.getRealPart() * num2.getImaginaryPart())) / divisor;
        return new RealNumber(realPart, imaginaryPart);
        }
    }
    

