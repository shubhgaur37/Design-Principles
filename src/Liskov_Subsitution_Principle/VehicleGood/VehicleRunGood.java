package Liskov_Subsitution_Principle.VehicleGood;
class EngineVehicle {
    public void startEngine(){
        System.out.println("Starting Engine....");
    }
}

class NonEngineVehicle {
    public void move(){
        System.out.println("Moving Vehicle....");
    }
}

class Car extends EngineVehicle{
    @Override
    public void startEngine(){
        System.out.println("Starting Car Engine");
    }
}

// Why the below implementation is better?
// 1. In this code, the vehicle hierarchy is refined to distinguish between EngineVehicle and NonEngineVehicle.
// 2. Each subtype fully satisfies the behavioural contract of its basetype.
// 3. Client code can interact with either vehicle type with no errors/exceptions or unexpected behavior.
// 4. The inheritance hierarchy accurately models the real world domain.
class Bicycle extends NonEngineVehicle{
    @Override
    public void move(){
        System.out.println("Moving Bicycle");
    }
}
public class VehicleRunGood{
    public static void main(String[] args){
        // Objects of different subclasses of Vehicle
        EngineVehicle car = new Car();
        NonEngineVehicle bicycle = new Bicycle();

        // Using Polymorphism

        // Car
        car.startEngine();
        // Bicycle
        bicycle.move();
    }
}

