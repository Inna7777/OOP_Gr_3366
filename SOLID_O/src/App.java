import VehicleDomen.Bus;
import VehicleDomen.Car;

public class App {
    public static void main(String[] args) throws Exception {
        Bus bus1 = new Bus(100, "Пассажирский автобус");
        Car car1 = new Car(200, "Легковой автомобиль");

        double busSpeed = bus1.calculateAllowedSpeed();
        double carSpeed = car1.calculateAllowedSpeed();

        System.out.println("Для " + bus1.getType() + " максимально допустимая скорость: " + busSpeed);
        System.out.println("Для " + car1.getType() + " максимально допустимая скорость: " + carSpeed);
    }
}
