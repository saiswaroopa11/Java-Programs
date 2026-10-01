zzzzzzzzzzimport java.util.Scanner;

public class OnlineStoreCart {

    
    static void displayOrder(String item, int quantity) {
        System.out.println("Item: " + item);
        System.out.println("Quantity: " + quantity);
    }

   
    static void displayOrder(String item, int quantity, double price) {
        System.out.println("Item: " + item);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price: Rs." + price);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

       
        String[] items = {"Laptop", "Headphones", "Mobile", "Keyboard", "Mouse"};
        double[] prices = {50000, 2000, 20000, 1000, 500};

        System.out.println("===== ONLINE STORE CART =====");

        
        System.out.println("\nAvailable Products:");

        for (int i = 0; i < items.length; i++) {
            System.out.println((i + 1) + ". " + items[i] + " - Rs." + prices[i]);
        }

      
        System.out.print("\nEnter product number: ");
        int choice = sc.nextInt();

        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();

        
        if (choice >= 1 && choice <= items.length) {

            String selectedItem = items[choice - 1];
            double price = prices[choice - 1];

           
            double total = price * quantity;

           
            double discount = 0;

            if (total >= 30000) {
                discount = total * 0.10;
            } else if (total >= 10000) {
                discount = total * 0.05;
            }

            double finalAmount = total - discount;

            System.out.println("\n===== ORDER DETAILS =====");

            displayOrder(selectedItem, quantity, price);

            System.out.println("Total Amount: Rs." + total);
            System.out.println("Discount: Rs." + discount);
            System.out.println("Final Amount: Rs." + finalAmount);

            if (finalAmount >= 30000) {
                System.out.println("Order Status: Premium Order");
            } else {
                System.out.println("Order Status: Normal Order");
            }

        } else {
            System.out.println("Invalid product number!");
        }

        sc.close();
    }
}