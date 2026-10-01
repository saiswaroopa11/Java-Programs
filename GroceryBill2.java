import java.util.Scanner; 
 
public class GroceryBill2 { 
    public static void main(String[] args) { 
 
        Scanner sc = new Scanner(System.in); 
 
        System.out.print("Enter Customer Name: "); 
        String name = sc.nextLine(); 
 
        System.out.print("Enter Quantity in kg: "); 
        double quantity = sc.nextDouble(); 
 
        double price = 60; 
        double total = quantity * price; 
 
        System.out.printf("%nCustomer Name: %s%n", name); 
        System.out.printf("Quantity: %.2f kg%n", quantity); 
        System.out.printf("Price per kg: ₹%.2f%n", price); 
        System.out.printf("Total Bill: ₹%.2f%n", total); 
    } 
} 