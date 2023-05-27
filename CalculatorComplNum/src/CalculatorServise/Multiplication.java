package CalculatorServise;
import Numbers.RealNumber;
import Controller.iComplexNumber;
import Controller.iOperation;
// класс для создания метода деления
public class Multiplication implements iOperation {

    @Override
    public iComplexNumber action(iComplexNumber num1, iComplexNumber num2) {
        double realPart = (num1.getRealPart() * num2.getRealPart()) - (num1.getImaginaryPart() * num2.getImaginaryPart());
        double imaginaryPart = (num1.getRealPart() * num2.getImaginaryPart()) + (num1.getImaginaryPart() * num2.getRealPart());
        return new RealNumber(realPart, imaginaryPart);
        }
    }

    
    
    
    

