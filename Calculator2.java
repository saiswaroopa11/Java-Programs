public class Calculator2{
  public void show_units(){
    System.out.println("Units:cm,kg,liter");
}

    public static void main(String[] args){


     Calculator2 cal1 = new Calculator2();
     Calculator2 cal2 = new Calculator2();

      cal1.show_units();
      cal2.show_units();

        int number = 7;

        if (number % 2 == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }
    }
}      






















