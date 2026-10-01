import java.util.Scanner;
class ThisKeyWord{
int a = 10;
void display(){
int a = 20;
System.out.println(a);
}
 public static void main(String[] args){
ThisKeyWord sc = new ThisKeyWord();
sc.display();
}
public class ParcelWeight {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter parcel weight: ");
            double weight = Double.parseDouble(sc.nextLine());

            System.out.println("Weight accepted: " + weight + " kg");

        } catch (NumberFormatException e) {
            System.out.println("Weight checked completed.");
        }

        sc.close();
    }
}