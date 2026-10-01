import java.util.Scanner; 
 
public class StringFormat { 
    public static void main(String[] args) { 
 
        Scanner sc = new Scanner(System.in); 
 
        System.out.print("Enter your name: "); 
        String name = sc.nextLine(); 
 
        System.out.printf("Student Name: %s", name); 
    } 
}