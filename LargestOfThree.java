public class LargestOfThree {
   public static void main (String[] args) {
      int a = 10 , b = 50 , c = 30 ;

      if (a >=b && a >= c)
         System.out.println(a + " is largest");
      else if  (b >= c)
         System.out.println(b + " is largest");
      else 
         System.out.println(c + " is largest");
  }
}