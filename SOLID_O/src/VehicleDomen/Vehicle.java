package VehicleDomen;

public class Vehicle {
    int maxSpeed;
    String type;
    // конструктор транспортного средства
    public Vehicle(int maxSpeed, String type) {
    this.maxSpeed = maxSpeed;
    this.type = type;
    }
    
    public int getMaxSpeed() {
    return this.maxSpeed;
    }
    public String getType() {
    return this.type;
    }
}

