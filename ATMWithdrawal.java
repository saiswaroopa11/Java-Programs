public class ATMWithdrawal {
  public static void main(String[] args) {

      int balance = 5000;
      int amount = 3000;
 
     if(balance >= amount){
       System.out.println("Withdrawal Successful");
    } else {
       System.out.println("Insufficient Balance");
     }
  }
}


