package InterfaceSegregationPrinciple.PrinterBadCode;

// The below design presents a violation of Interface Segregation Principle when implementing a basic Printer device
public interface Machine {
    void print();
    void scan();
    void fax();
}


class AllInOnePrinter implements Machine{
    @Override
    public void print(){
        System.out.println("Printing");
    }
    @Override
    public void scan(){
        System.out.println("Scanning");
    }
    @Override
    public void fax(){
        System.out.println("Faxing");
    }
}

// The fundamental issue arises when a Basic Printer class which is solely designed for printing, also needs to implement other irrelevant methods
// of the Machine interface which forces this class to provide implementations for scan and fax, despite these functionalities being outside the 
// scope of its core functionality.

// Also, one of the outcomes of this violation is that class is burdened with irrelevant methods(because the exceptions need to be handled
// each time these irrelevant functions get called for Basic Printer, either accidentally or intentially),leading to unnecessary complexity 
// and potential runtime errors.

// When a class is required to implement irrelevant methods of an interface, it results in a bloated(fat) interface 

// The design flaw also makes the code less flexible and harder to extend.

// This creates unnecessary dependencies and increases the risk of introducing bugs.

// By forcing classes to implement irrelevant methods, the code becomes tightly coupled which reduces its modularity and reusability.

class BasicPrinter implements Machine{
    @Override
    public void print(){
        System.out.println("Printing");
    }
    @Override
    public void scan(){
        throw new UnsupportedOperationException("Basic Printer can't scan");
    }
    @Override
    public void fax(){
    throw new UnsupportedOperationException("Basic Printer can't fax");
    }
}

