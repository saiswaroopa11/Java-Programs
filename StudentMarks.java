import java.util.Scanner; 
 
public class StudentMarks { 
    public static void main(String[] args) { 
 
        Scanner sc = new Scanner(System.in); 
 
        System.out.print("Enter Roll Number: "); 
        int rollNo = sc.nextInt(); 
 
        sc.nextLine(); 
 
        System.out.print("Enter Student Name: "); 
        String name = sc.nextLine(); 
 
        System.out.print("Enter Marks: "); 
        double marks = sc.nextDouble(); 
 
        System.out.print("Enter Grade: "); 
        char grade = sc.next().charAt(0); 
 
        System.out.printf("%nRoll Number: %d%n", rollNo); 
        System.out.printf("Student Name: %s%n", name); 
        System.out.printf("Marks: %.2f%n", marks); 
        System.out.printf("Grade: %c%n", grade); 
    } 
}