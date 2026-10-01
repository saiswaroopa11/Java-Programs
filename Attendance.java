import java.util.Scanner;

public class Attendance{
  public static void main(String[] args) {

  Scanner sc = new Scanner(System.in);

  System.out.println("enter a number");
   int number = sc.nextInt();

  if(number>=75)
    {
  System.out.println("Eligible fot attendance");
  }
  else
  {
  System.out.println("not Eligible for attendance");
   }


  sc.close();
    }
  }