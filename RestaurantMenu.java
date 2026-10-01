import java.util.Scanner;

public class RestaurantMenu {
  public static void main(String[] args) {

  Scanner sc = new Scanner(System.in);

  System.out.println("Restaurant Menu");
  System.out.println("1. Pizza - Rs.200");
  System.out.println("2. Burger - Rs.120");
  System.out.println("3. Sandwich  - Rs.100");
  System.out.println("4. Biryani - Rs.300");

  System.out.print("Enter your choise:");
  
  int choise = sc.nextInt();

  switch (choise){

  case 1 :
          System.out.println("Selected Food: Pizza");
          System.out.println("1. Pizza - Rs.200");
          break;

  case 2 :
          System.out.println("Selected Food: Burger");
          System.out.println("2. Burger - Rs.120");
          break;

   case 3 :
          System.out.println("Selected Food: Sandwich");
          System.out.println("3. Sandwich  - Rs.100");
          break;

  case 4 :
          System.out.println("Selected Food: Biryani");
          System.out.println("4. Biryani - Rs.300");
          break;
  default:
          System.out.println("invalid choise");
  }
 
  sc.close();

   }

 } 
  




  