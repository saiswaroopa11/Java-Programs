import java.util.Scanner; 
 
public class EmployeeSalary { 
    public static void main(String[] args) { 
 
        Scanner sc = new Scanner(System.in); 
 
        System.out.print("Enter Employee ID: "); 
        int id = sc.nextInt(); 
 
        sc.nextLine(); 
 
        System.out.print("Enter Employee Name: "); 
        String name = sc.nextLine(); 
 
        System.out.print("Enter Basic Salary: "); 
        double salary = sc.nextDouble(); 
 
        System.out.print("Enter Bonus: "); 
        double bonus = sc.nextDouble(); 
 
        double totalSalary = salary + bonus; 
 
        System.out.printf("%nEmployee ID: %d%n", id); 
        System.out.printf("Employee Name: %s%n", name); 
        System.out.printf("Basic Salary: ₹%.2f%n", salary); 
        System.out.printf("Bonus: ₹%.2f%n", bonus); 
        System.out.printf("Total Salary: ₹%.2f%n", totalSalary); 
    } 
}