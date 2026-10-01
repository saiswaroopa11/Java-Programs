import java.util.Scanner;
public class Salary {
  public static void main(String[] args){


  Scanner sc = new Scanner(System.in);

  System.out.println("Enter basic salary");
  double basicsalary = sc.nextDouble();

   System.out.println("Enter HRA");
  double HRA = sc.nextDouble();


   System.out.println("Enter allowance");
  double allowance = sc.nextDouble();

  double Salary = basicsalary + HRA + allowance;

  System.out.println("Total salary = " + Salary);

    }
}
