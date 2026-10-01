import java.util.Scanner;
   public class Temperature{
      public static void main(String[] args);

      Scanner sc = new Scanner(System.in);

      System.out.println("Enter temperature in Celsius");
      double Celsius = sc.nextDouble();

       double fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println("Celsius = " + celsius + "°C");
        System.out.println("Fahrenheit = " + fahrenheit + "°F");

    }
}