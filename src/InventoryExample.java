package src;

class Inventory {
    private int stock = 50;

    public synchronized void purchaseItem(String buyer, int quantity) {
        if (quantity <= stock) {
            System.out.println(buyer + " purchased " + quantity + " item(s).");
            stock -= quantity;
            System.out.println("Stock left: " + stock);
        } else {
            System.out.println(buyer + " requested " + quantity + " item(s), but only " + stock + " are available.");
        }
    }
}

class BuyerThread extends Thread {
    private Inventory inventory;
    private String buyer;
    private int quantity;

    public BuyerThread(Inventory inventory, String buyer, int quantity) {
        this.inventory = inventory;
        this.buyer = buyer;
        this.quantity = quantity;
    }

    @Override
    public void run() {
        inventory.purchaseItem(buyer, quantity);
    }
}

public class InventoryExample {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        BuyerThread buyer1 = new BuyerThread(inventory, "Buyer1", 20);
        BuyerThread buyer2 = new BuyerThread(inventory, "Buyer2", 30);
        BuyerThread buyer3 = new BuyerThread(inventory, "Buyer3", 10);

        buyer1.start();
        buyer2.start();
        buyer3.start();
    }
}
