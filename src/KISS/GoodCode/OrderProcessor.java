package KISS.GoodCode;

class Item{
    double price;
    int quantity;

    Item(double price, int quantity){
        this.price = price;
        this.quantity = quantity;
    }
}

// Follows KISS: Breaking down the logic into reusable code which is more modular.
public class OrderProcessor {
    
    public static double calculateSubtotal(Item[] order){
        double subtotal = 0;
        for (Item item: order)
            subtotal += item.price * item.quantity; // calculate subtotal
        return subtotal;
    }

    public static double calculateTotal(double subtotal, double taxRate){
        return subtotal * (1 + taxRate);
    }

    public static void main(String[] args) {
        Item [] items = {new Item(100,2), new Item(50,3)};

        double taxRate = 0.1;
        double subTotal = calculateSubtotal(items);
        double total = calculateTotal(subTotal, taxRate);

        System.out.println("Subtotal: " + subTotal);
        System.out.println("Total After Taxes: " + total);

    }
}