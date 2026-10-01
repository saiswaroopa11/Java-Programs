import java.util.Scanner;
public class Salary {
  public static void main(String[] args){


  Scanner sc = new Scanner(System.in);

  System.out.println("Enter basic salary");
  double basicsalary = sc.nxtDouble();

   System.out.println("Enter HRA");
  double HRA = sc.nxtDouble();


   System.out.println("Enter allowance");
  double allowance = sc.nxtDouble();

  double Salary = basicsalary + HRA + allowance;

  System.out.println("Total salary = " + Salary")

    }
}
