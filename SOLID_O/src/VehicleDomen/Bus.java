package VehicleDomen;

import Controller.iSpeedCalculation;
// наследуется от Класса Транспортные средства 
//использует метод calculateAllowedSpeed через интерфейс iSpeedCalculation
public class Bus extends Vehicle implements iSpeedCalculation{

    public Bus(int maxSpeed, String type) {
        super(maxSpeed, type);
        
    }

    @Override
    public double calculateAllowedSpeed() {
        return getMaxSpeed() * 0.8;
    }
    
}
