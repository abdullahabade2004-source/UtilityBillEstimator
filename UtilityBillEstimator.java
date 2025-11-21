import java.util.Scanner;

public class UtilityBillEstimator {

    public static void main(String[] args) {

 
        Scanner input = new Scanner(System.in);


        String name, accountNumber;
        double usage, rate, totalCost;

   
        System.out.println("=== BASIC UTILITY BILL ESTIMATOR ===");

   
        System.out.print("Enter User Name: ");
        name = input.nextLine();

        System.out.print("Enter Account Number: ");
        accountNumber = input.nextLine();

        System.out.print("Enter Monthly Usage in kWh: ");
        usage = input.nextDouble();


        rate = 0.50;  


        totalCost = usage * rate;


        System.out.println("\n=== FINAL BILL SUMMARY ===");
        System.out.println("Name                : " + name);
        System.out.println("Account Number      : " + accountNumber);
        System.out.println("Usage (kWh)         : " + usage);
        System.out.println("Unit Rate (RM/kWh)  : " + rate);
        System.out.println("Total Bill (RM)     : " + totalCost);

        input.close();
    }
}