package Numbers;
import Controller.iComplexNumber;

public class ImaginaryNumber implements iComplexNumber {
    private double realPart;
    private double imaginaryPart;
/**
 * конструктор принимает один аргумент, 
 * который является действительной частью =0. 
 * и устанавливает переменную imaginaryPart .
 * @param imaginaryPart
 */
    public ImaginaryNumber(double imaginaryPart) {
        this.realPart = 0.0;
        this.imaginaryPart = imaginaryPart;
    }

    public ImaginaryNumber(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    @Override
    public double getRealPart() {
       return realPart;
    }

    @Override
    public double getImaginaryPart() {
        return imaginaryPart;
    }

    @Override
    public void setRealPart(double realPart) {
       this.realPart=realPart;
    }

    @Override
    public void setImaginaryPart(double imaginaryPart) {
       this.imaginaryPart=imaginaryPart;
    }

    @Override
    public String toString() {
        if (realPart >= 0) {
            return imaginaryPart + "i+" + realPart;
        } else {
            return imaginaryPart + "i" + realPart;
        }
    }
    
}
