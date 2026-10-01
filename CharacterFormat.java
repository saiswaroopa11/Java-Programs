import java.util.Scanner; 
 
public class CharacterFormat { 
    public static void main(String[] args) { 
 
        Scanner sc = new Scanner(System.in); 
 
        System.out.print("Enter your section: "); 
        char section = sc.next().charAt(0); 
 
        System.out.printf("Your section is %c", section); 
    } 
} 