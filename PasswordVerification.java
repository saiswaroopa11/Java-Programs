import java.util.Scanner;

public class PasswordVerification {
public static void main(String[] args) {

int password;
Scanner sc = new Scanner(System.in);

System.out.print("Enter your password: ");
password = sc.nextInt();

if (password == 1234)
System.out.print("Correct password"){
} else {
    System.out.print("Incorrect password");

    sc.close();
   }
}

  

