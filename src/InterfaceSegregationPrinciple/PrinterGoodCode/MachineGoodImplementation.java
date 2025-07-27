package InterfaceSegregationPrinciple.PrinterGoodCode;

// Follows the principle of interface cohesion: Each interface has a specific responsibility leading to better cohesion and separation of concerns.
interface Print{
    void print();
}

interface Scan{
    void scan();
}

interface Fax{
    void fax();
}

// By separating the interfaces, we ensure that classes only implement methods which are relevant to them, leading to a more robust and 
// maintainable system
class AllInOnePrinter implements Print, Fax, Scan{
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

// Prevents us from providing dummy implementations for BasicPrinter
class BasicPrinter implements Print{
    @Override
    public void print(){
        System.out.println("Printing");
    }
}

