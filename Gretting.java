import java.util.Scanner;
public class Gretting {
 public void say_hello(){
  
 System.out.println("Hello,world!");
}

 public static void main(String[] args){
  Gretting obj1 =new Greeting();
  Gretting obj2 =new Greeting();
  Gretting obj3 =new Greeting();
 
obj1.say_hello();
obj2.say_hello();
obj3.say_hello();
 Scanner sc = new Scanner(System.in);

 System.out.println("Enter no.of  visitors");
 int visitors = sc.nextInt();

  if(visitors>5) {
  System.out.println("Busy Day"); 
}else{
  System.out.println("Normal Day");
    }

 sc.close();
}

}