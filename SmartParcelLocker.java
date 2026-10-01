import java.util.Scanner;

public class SmartParcelLocker {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);

    //1.Accept details
    System.out.print("Enter Parcel ID: ");
    int parcelId=sc.nextInt();// consume newline

    System.out.print("Enter Recipient Name: ");
    String recipientName = sc.nextLine();
     System.out.print("Enter Mobile Number: ");

        long mobileNumber = sc.nextLong();
        sc.nextLine(); // consume newline

    System.out.print("Enter Parcel Size (Small/Medium/Large): ");
        String parcelSize = sc.nextLine();

     System.out.print("Enter Parcel Weight (in kg): ");
        double parcelWeight = sc.nextDouble();
  
     System.out.print("Express Delivery? (true/false): ");
        boolean expressDelivery = sc.nextBoolean();

        // 2. Assign Locker based on size
        String lockerAssigned;
        if (parcelSize.equalsIgnoreCase("Small")) {
            lockerAssigned = "Locker A";
        } else if (parcelSize.equalsIgnoreCase("Medium")) {
            lockerAssigned = "Locker B";
        } else if (parcelSize.equalsIgnoreCase("Large")) {
            lockerAssigned = "Locker C";
        } else {
            lockerAssigned = "Invalid Size";
        }

        // 3. Calculate storage fee
        double ratePerKg = expressDelivery ? 40.0 : 25.0;
        double storageFee = parcelWeight * ratePerKg;

        // 4. Generate Pickup Code
        int pickupCode = parcelId + 5000;

        // 5. Display Formatted Receipt
        System.out.println("\n========== KLH UNIVERSITY PARCEL RECEIPT ==========");
        System.out.println("Parcel ID       : " + parcelId);
        System.out.println("Recipient Name  : " + recipientName);
        System.out.println("Mobile Number   : " + mobileNumber);
        System.out.println("Parcel Size     : " + parcelSize);
        System.out.println("Locker Assigned : " + lockerAssigned);
        System.out.println("Parcel Weight   : " + parcelWeight + " kg");
        System.out.println("Express Service : " + (expressDelivery ? "Yes" : "No"));
        System.out.println("Storage Fee     : ₹" + storageFee);
        System.out.println("Pickup Code     : " + pickupCode);
        System.out.println("===================================================");

        sc.close();
    }
}
