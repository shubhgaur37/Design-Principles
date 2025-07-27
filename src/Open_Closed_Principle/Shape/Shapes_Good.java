package Open_Closed_Principle.Shape;
import java.lang.Math;
// Better way is to use abstract class or interfaces ensuring that all shapes inherits the method efficiently
abstract class Shapes_Good {
    abstract Double calculateArea();
}

class Rectangle extends Shapes_Good{
    private Double length;
    private Double breadth;
    @Override
    public Double calculateArea(){
        return length*breadth;
    }
}

class Square extends Shapes_Good{
    private Double side_length;
    @Override
    public Double calculateArea(){
        return Math.pow(side_length, 2);
    }
}


// Advantages:
// 1. Code is more maintainable as I need to separately maintain individual components i.e. shapes.
// 2. Easier to understand.
// 3. Adding a new shape doesn't require modifying existing code.
// 4. Prevents breaking existing code.
// 5. Encourages creation of reusable components. In this case Shapes abstract class and its methods.


// Also, Reviewing any code with changes to existing production code is very hard and highly prone to errors which can cost precious 
// time for rectification

