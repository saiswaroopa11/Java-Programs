import java.util.Scanner;

public class BalanceAccount {
   public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);

     System.out.print("Enter a number: ");
     int number = sc.nextInt();

    number += 3500;
    System.out.println("After'+='(Add 3500):" + number);
   
    sc.close();
  }
}

