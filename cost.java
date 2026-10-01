import java.util.Scanner;
    public class cost {
       public static void main(String[] args){

          Scanner sc = new Scanner(System.in);
          
          System.out.println("Enter product price");
          int price = sc.nextInt();

         System.out.println("Enter quantity");
         int quantity = sc.nextInt();
         

        int total = price * quantity;

         System.out.println("Product Price : "  + price);
         System.out.println("Quantity : " + quantity);
         System.out.println("Total Amount : " + total);
       }
    }
