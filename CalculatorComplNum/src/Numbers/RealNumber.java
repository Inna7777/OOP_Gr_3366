package Numbers;
//создаем класс Действительной части комплексного числа и имплемитируем методы из интерфейса ComplexNumber

import Controller.iComplexNumber;

public class RealNumber implements iComplexNumber{
    private double realPart;
    private double imaginaryPart;
/**
 * конструктор принимает один аргумент, 
 * который является действительной частью числа. 
 * Он устанавливает переменную realPart в действительную часть числа
 * и устанавливает переменную imaginaryPart = 0,0.
 * @param realPart
 */
    public RealNumber(double realPart) {
        this.realPart = realPart;
        this.imaginaryPart = 0.0;
    }
 /**
  * конструктор принимает два аргумента, действительную и мнимую части числа. 
  Он устанавливает переменные realPart и imaginaryPart в эти значения.
  * @param realPart
  * @param imaginaryPart
  */   
    public RealNumber(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }
// методы переопределенные из интерфейса
    @Override
    public double getImaginaryPart() {
            return imaginaryPart;
    }

    @Override
    public double getRealPart() {
        return realPart;
    }

    @Override
    public void setImaginaryPart(double imaginaryPart) {
       this.imaginaryPart = imaginaryPart;
    }

    @Override
    public void setRealPart(double realPart) {
        this.realPart = realPart;
    }
// метод вывода на печать
    @Override
    public String toString() {
        if (realPart >= 0) {
            return imaginaryPart + "i+" + realPart;
        } else {
            return imaginaryPart + "i" + realPart;
        }
    }

    
}
