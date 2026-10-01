import java.util.Scanner; 
 
public class FloatFormat { 
    public static void main(String[] args) { 
 
        Scanner sc = new Scanner(System.in); 
 
        System.out.print("Enter your salary: "); 
        double salary = sc.nextDouble(); 
 
        System.out.printf("Your salary is %f", salary); 
    } 
} 