package Liskov_Subsitution_Principle.VehicleBad;

class Vehicle {
    public void startEngine(){
        System.out.println("Starting Engine....");
    }
}

class Car extends Vehicle{
    @Override
    public void startEngine(){
        System.out.println("Starting Car Engine");
    }
}

class Bicycle extends Vehicle{
    @Override
    public void startEngine(){
        // Problem: Bicycles don't have engines
        throw new UnsupportedOperationException("Bicycles don't have engines");
    }
}
// Problems in the code below:
// 1. Here, the Vehicle class has a method startEngine(), which is appropriate for Car but not so much for Bicycle.
// which violates Liskov_Subsitution_Principle because Bicycle class cannot be used/substituted in place of Vehicle class without causing 
// an exception.
// 2. When a subclass cannot fulfill the contract of its base class it leads to breakdown in polymorphism, making the code less reliable and more
// unpredictable.
// 3. The Bicycle class, when forced to implement startEngine() of its base class needs to provide a meaningless implementation or throw an 
// exception, both of which are undesirable outcomes.
// 4. The design flaw also makes the code less flexible and harder to extend.Eg. In the future I want to add a cart then the above issue will 
// come up again. In summary, as similar vehicle types get added they too would be forced to adhere to the contract of Vehicle class and cause more 
// meaningless implementations further violating LSP.
// 5. The tight coupling between the Vehicle class and its subclasses reduces the modularity and reusability of the code which is not the spirit
// of LLD.

public class VehicleRunBad{
    public static void main(String[] args){
        // Objects of different subclasses of Vehicle
        Vehicle car = new Car();
        Vehicle bicycle = new Bicycle();

        // Using Polymorphism

        //car
        car.startEngine();

        try{
            bicycle.startEngine();
        }
        catch(UnsupportedOperationException e){
            System.out.println("Error :" + e.getMessage());
        }
    }
}

