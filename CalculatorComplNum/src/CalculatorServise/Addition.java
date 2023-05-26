package CalculatorServise;


import Controller.iComplexNumber;
import Controller.iOperation;
import Numbers.RealNumber;

// класс  для создания метода сложениия комплексных чисел
public class Addition implements iOperation {

   
//имлемитированный метод
     @Override
    public iComplexNumber action(iComplexNumber num1, iComplexNumber num2) {
        double realPart = num1.getRealPart() + num2.getRealPart();
        double imaginaryPart = num1.getImaginaryPart() + num2.getImaginaryPart();
        return new RealNumber(realPart, imaginaryPart);
        }
    }
    
    

