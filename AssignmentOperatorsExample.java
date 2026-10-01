import java.util.Scanner;

public class AssignmentOperatorsExample {

   public static void main(String[] args){
 
   Scanner sc = new Scanner(System.in);

   System.out.print("Enter first number =  ");
   int num = sc.nextInt();

  //Assignment Operator
  int value = num;
  System.out.print("\nAfter'='Assignment:"+ value);

  // += Add and Assign
  value += 10;
  System.out.println("After'+='(Add10):" + value);

  // -= Subtract and Assign
  value-= 5;
  System.out.println("After'+='(Add10):" + value);

 
  // *=Multiply and Assign
  value*=2;
  System.out.println("After'*='(Multiply by 2):" + value);

  // /=Divide and Assign
  value /=3;
  System.out.println("After'/='(Divide by 3):" + value);
 
  // %=Moduand Assign
  value %=4;
  System.out.println("After'%='(Modulus by 4):" + value);

  sc.close();
 }
}


  

    