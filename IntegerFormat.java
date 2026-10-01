import java.util.Scanner; 
 
public class IntegerFormat { 
    public static void main(String[] args) { 
 
        Scanner sc = new Scanner(System.in); 
 
        System.out.print("Enter your age: "); 
        int age = sc.nextInt(); 
 
        System.out.printf("Your age is %d", age); 
    } 
}