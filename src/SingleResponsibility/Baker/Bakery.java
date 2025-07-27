package SingleResponsibility.Baker;

public class Bakery {
    public static void main(String[] args) {
        BreadBaker baker = new BreadBaker();
        InventoryManager inventoryManager = new InventoryManager();
        SupplyOrder supplyOrder = new SupplyOrder();
        CustomerService customerService = new CustomerService();
        BakeryCleaner bakeryCleaner = new BakeryCleaner();


        // Each class focuses on its single responsibility
        baker.bakeBread();
        inventoryManager.manageInventory();
        supplyOrder.orderSupplies();
        customerService.serveCustomers();
        bakeryCleaner.cleanBakery();
    }
}
