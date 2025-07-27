package Open_Closed_Principle.Shape;

public class Shapes_Bad {
    private String type;
    public double calculateArea(){
        if (type.equals("Circle"))
            //do something
        else if (type.equals("Rectangle"))
            //do something
        // suppose I want to extend the functionality to calculate area of triangle, then I need to modify the method which violates Open_Closed_Principle
        else 
            //do something
    }
}

// Problems:
// 1. Violates Open Closed Principle
// 2. Tightly couples the shapes class to specific shapes, reducing extensibility
// 3. Each time a new shape needs to be added, we must modify the calculateArea method which increases the risk of errors and makes the system less flexible