import java.util.Scanner;

public class AverageWithholding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double income;
        double gross;
        double rate;

        // Prompt the user to input their income as a number
        System.out.println("Enter your weekly income (Numbers only please, we don't have error-handling right now!): ");
        income = sc.nextDouble();

        // Calculate tax based on income brackets
        if (income < 500) {
            rate = 0.10;
            gross = income * rate;
            System.out.println("Your withholding after tax is $" + gross + " at 10% tax rate.");
        } else if (income >= 500 && income < 1500) {
            rate = 0.15;
            gross = income * rate;
            System.out.println("Your withholding after tax is $" + gross + " at 15% tax rate.");
        } else if (income >= 1500 && income < 2500) {
            rate = 0.20;
            gross = income * rate;
            System.out.println("Your withholding after tax is $" + gross + " at 20% tax rate.");
        } else {
            rate = 0.30;
            gross = income * rate;
            System.out.println("Your withholding after tax is $" + gross + " at 30% tax rate.");
        }

        sc.close();
    }
}
