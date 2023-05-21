package VehicleDomen;

import Controller.iSpeedCalculation;
// наследуется от Класса Транспортные средства 
//использует метод calculateAllowedSpeed через интерфейс iSpeedCalculation
public class Car extends Vehicle implements iSpeedCalculation{

    public Car(int maxSpeed, String type) {
        super(maxSpeed, type);
        
    }

    @Override
    public double calculateAllowedSpeed() {
        return getMaxSpeed() * 0.8;
    }
}