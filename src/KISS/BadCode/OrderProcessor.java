package KISS.BadCode;

class Item{
    double price;
    int quantity;

    Item(double price, int quantity){
        this.price = price;
        this.quantity = quantity;
    }
}

// Bad Code: Process Order logic is combined intoa a single function(too much logic) which violates KISS
public class OrderProcessor {
    public static double processOrder(Item[] order, double taxRate){
        double total = 0;
        for (Item item: order)
            total += item.price * item.quantity; // calculate itemTotal
        total += total * taxRate; // Add tax
        return taxRate; // return final total
    }
}
