package Controller;

//реализуем паттерн "Фабричный метод"
//создаем интерфейс Комплексные числа
public interface iComplexNumber {
    double getRealPart(); //возвращаем действительную часть
    double getImaginaryPart(); //возвращаем мнимую часть
    void setRealPart(double realPart); //назначаем действительную часть комплексного числа
    void setImaginaryPart(double imaginaryPart);//назначаем мнимую часть коплексного числа
}
